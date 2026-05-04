# Questão 1 - Sistema academico

print("{Questão 1 - Sistema acadêmico}")

login = input("Login: ")
senha = input("Senha: ")

if login == "professor" and senha == "ads123":
    print("Acesso validado")
else:
    print("Acesso negado")

# Questão 2 - Controle de acesso por idade

print("{Questão 2 - Controle de acesso por idade}")

idade = int(input("Idade: "))

if idade < 18:
    print("Acesso bloqueado")
elif idade > 60:
    print("Acesso prioritário")
else:
    print("Acesso normal")

# Questão 3 - Validação de dados numéricos

print("{Questão 3 - Validação de dados numéricos}")

numero = float(input("Número: "))

if numero >= 20 and numero <= 50:
    print("Número válido")
else:
    print("Número inválido")

# Questão 4 - Sistema de avaliação acadêmica

print("{Questão 4 - Sistema de avaliação acadêmica}")

nota1 = float(input("1° Nota: "))
nota2 = float(input("2° Nota: "))
media = (nota1 + nota2) / 2

if media > 10:
    print("Média inválida")
elif media >= 7:
    print("Aprovado, (Média:", media, ")")
elif media >= 5:
    print("Recuperação, (Média:", media, ")")
else:
    print("Reprovado")

# Questão 5 - Validação de senha numérica

print("{Questão 5 - Validação de senha numérica}")

senhaN = int(input("Senha numérica: "))

if senhaN >= 1000 and senhaN <= 9999:
    print("Senha válida")
else:
    print("Senha inválida")

# Questão 6 - Validação de parâmetros

print("{Questão 6 - Validação de parâmetros}")

sensor1 = int(input("Valor do sensor 1: "))
sensor2 = int(input("Valor do sensor 2: "))

if sensor1 > 10 and sensor2 < 5:
    print("Dados dos sensores válidos")
else:
    print("Dados dos sensores inválidos")