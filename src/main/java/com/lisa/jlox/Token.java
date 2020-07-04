package com.lisa.jlox;

class Token {
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line;

    Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;//値
        this.literal = literal;//リテラル
        this.line = line;//行数(error handlingのため)
    }

    public String toString() {
        return type + " " + lexeme + " " + literal;
    }
}
