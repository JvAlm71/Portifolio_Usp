section .data
    resultMessage db "Resultado: ", 0
    newline db 10  ; Caractere de nova linha

section .bss
    result resb 10  ; Reservar espaço para até 10 bytes para o resultado

section .text
global _start

_start:
    ; Carregar os dois números inteiros em registradores
    mov rax, 10          ; Aqui carrega os numeros nos registradores
    mov rbx, 20         

    ; Somar os dois números
    add rax, rbx        ; O resultado da soma será armazenado em rax

    ; Converter o número em rax para uma string e armazenar em 'result'
    call intToString

    ; Exibir a mensagem "Resultado: "
    mov rax, 1          ; syscall: write
    mov rdi, 1          ; file descriptor: stdout
    mov rsi, resultMessage
    mov rdx, 11         ; tamanho da mensagem
    syscall

    ; Exibir o resultado
    mov rax, 1          ; syscall: write
    mov rdi, 1          ; file descriptor: stdout
    mov rsi, result
    mov rdx, 10         ; tamanho máximo do resultado
    syscall

    ; Exibir nova linha
    mov rax, 1          ; syscall: write
    mov rdi, 1          ; file descriptor: stdout
    mov rsi, newline
    mov rdx, 1          ; tamanho do newline
    syscall

    ; Terminar o programa
    mov rax, 60         ; syscall: exit
    xor rdi, rdi        ; status: 0
    syscall

; Função para converter um número inteiro em uma string
intToString:
    ; rax contém o número
    ; rsi apontará para o final da string result
    lea rsi, [result + 10]
    mov byte [rsi], 0   ; terminador de string

reverseLoop:
    dec rsi             ; mover para trás na string
    xor rdx, rdx        ; limpar rdx
    mov rbx, 10
    div rbx             ; dividir rax por 10, resultado em rax, resto em rdx
    add dl, '0'         ; converter o resto em caractere
    mov [rsi], dl       ; armazenar o caractere na string

    test rax, rax       ; verificar se rax é zero
    jnz reverseLoop     ; se não for, continuar o loop

    mov rdi, rsi        ; mover o início da string para rdi
    ret
