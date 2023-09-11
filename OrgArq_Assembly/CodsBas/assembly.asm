            ; Fazendo o hello World

bits 64

section .data       ; Onde ficam as variáveis globais
    msg: db "Hello World!", 0xa
    MSG_LEN equ $ - msg

    section .text

        global _start
        _start:
        mov rax, 1
        mov rdi, 1
        mov rsi, msg
        mov rdx, MSG_LEN
        syscall  ; write(1, msg, MSG_LEN)

        mov rax, 60
        xor rdi, rdi
        syscall ; exit(0)