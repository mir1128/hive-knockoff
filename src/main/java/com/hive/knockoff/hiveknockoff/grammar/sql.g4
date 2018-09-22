grammar sql;

parse
    : ( sql_stmt_list )* EOF
    ;

sql_stmt_list
    : ';'* sql_stmt ( ';'+ sql_stmt )* ';'*
    ;

sql_stmt
    : create_table_stmt
    | drop_table_stmt
    | insert_stmt
    | delete_stmt
    | select_stmt
    ;

create_table_stmt
    : K_CREATE K_TABLE ( database_name '.' )? table_name ( '(' column_def ( ',' column_def )*  ')' )?
    ;

drop_table_stmt
    : K_DROP K_TABLE ( database_name '.' )? table_name
    ;

insert_stmt
    : K_INSERT K_INTO ( database_name '.' )? table_name ( '(' column_name ( ',' column_name )* ')' )?
        ( K_VALUES '(' expr ( ',' expr )* ')' )
    ;

select_stmt
    : select_or_values ( K_LIMIT expr )?
    ;

select_or_values
    : K_SELECT result_column ( ',' result_column )* K_FROM  table_or_subquery
    ;

result_column
    : '*'
    | table_name '.' '*'
    | expr
    ;

table_or_subquery
    : ( database_name '.' )? table_name
    ;


delete_stmt
    : K_DELETE K_FROM qualified_table_name
    ( K_WHERE expr )?
    ;

database_name
    : any_name
    ;

table_name
    : any_name
    ;

column_name
    : any_name
    ;

qualified_table_name
    : ( database_name '.' )? table_name
    ;

column_def
    : column_name type_name?
    ;

type_name
    : any_name+ ( '(' signed_number ')'
         | '(' signed_number ',' signed_number ')' )?
    ;

any_name
    : IDENTIFIER
    | keyword
    | STRING_LITERAL
    | '(' any_name ')'
    ;

signed_number
    : ( '+' | '-' )? NUMERIC_LITERAL
    ;

expr
    : literal_value
    | expr ( '=' | '==' | '!=' ) expr
    ;

literal_value
    : NUMERIC_LITERAL
    | STRING_LITERAL
    ;

keyword
    : K_CREATE
    | K_TABLE
    | K_DROP
    | K_INSERT
    | K_INTO
    | K_VALUES
    | K_DELETE
    | K_FROM
    | K_WHERE
    | K_SELECT
    | K_LIMIT
    ;

K_CREATE : C R E A T E;
K_TABLE : T A B L E;
K_DROP : D R O P;
K_INSERT : I N S E R T;
K_INTO : I N T O;
K_VALUES : V A L U E S;
K_DELETE : D E L E T E;
K_FROM : F R O M;
K_WHERE : W H E R E;
K_SELECT : S E L E C T;
K_LIMIT : L I M I T;

IDENTIFIER
    : [a-zA-Z_] [a-zA-Z_0-9]*
    ;

NUMERIC_LITERAL
    : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
    | '.' DIGIT+ ( E [-+]? DIGIT+ )?
    ;

STRING_LITERAL
    : '\'' ( ~'\'' | '\'\'' )* '\''
    ;

SPACES
    : [ \u000B\t\r\n]+ -> skip
    ;

UNEXPECTED_CHAR
    : .
    ;

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];
