# Questão 1 - Um sistema acadêmico precisa exibir os números das salas disponíveis de 1 até 10.

for i in range(10):
    print("Sala {}".format(i+1))

# Questão 2 - Um estacionamento deseja calcular o valor total arrecadado em 5 veículos.
print('---------------')

valorfinal = 0
for i in range(5):
    valorpago = float(input('Digite o valor pago no {}° veículo: '.format(i+1)))
    valorfinal = valorfinal + valorpago

print('Total arrecadado no final: {}'.format(valorfinal))

# Questão 3 - Um sistema de login deve continuar pedindo a senha até que o usuário digite a senha correta.
print('---------------')

senha = input('Digite a senha: ')
while senha != 'ads2026':
    senha = input('A senha está errada. \nDigite a senha novamente: ')

print('Senha correta :)')

# Questão 4 - Desenvolva um programa que exiba apenas os números pares de 1 até 20 utilizando for.
print('---------------')

for i in range(2, 21, 2):
    print(i)

# Questão 5 - Crie um programa que solicite números ao usuário até que ele digite 0.
print('---------------')

numero = 1
contador = 0

while numero != 0:
    numero = float(input('Digite um número: '))
    contador += 1
    
print('Você acertou :)')
print('Você precisou de {} tentativas para acertar.'.format(contador))

# Questão 6 - Um sistema escolar deseja calcular a média de 4 notas.
print('---------------')

media = 0
for i in range(4):
    nota = int(input('Digite a {}° nota: '.format(i+1)))
    media = media + nota

media = media / 4
print('A média do aluno é {:.1f}'.format(media))
    
# Questão 7 - Desenvolva um programa que apresente o seguinte menu utilizando match-case:
print('---------------')

print('[1] Cadastrar aluno')
print('[2] Consultar aluno')
print('[3] Excluir aluno')
print('[4] Sair')
opcao = int(input("Selecione a opção [1-4]: "))

match opcao:
    case 1:
        print('Cadastrando aluno...')
    case 2:
        print('Consultando aluno....')
    case 3:
        print('Excluindo aluno...')
    case 4:
        print('Saindo...')
    case _:
        print('Opção inválida.')
    
# Questão 8 - Crie uma calculadora simples utilizando match-case.
print('---------------')

n1 = float(input('Digite o primeiro número: '))
n2 = float(input('Digite o segundo número: '))
ope = input('Digite a operação [+, -, *, /]: ')
resultado = 0

match ope:
    case '+':
        resultado = n1+n2
        print('A soma de {} + {} vale: {}'.format(n1, n2, resultado))
    case '-':
        resultado = n1-n2
        print('A subtração de {} - {} vale: {}'.format(n1, n2, resultado))
    case '*':
        resultado = n1*n2
        print('A multiplicação de {} x {} vale: {}'.format(n1, n2, resultado))
    case '/':
        resultado = n1/n2
        print('A divisão de {} / {} vale: {}'.format(n1, n2, resultado))
    case _:
        print('Operador inválido.')

# Questão 9 - Faça um programa que exiba a tabuada de um número informado pelo usuário utilizando for.
print('---------------')

num = int(input('Digite um número: '))
resultadot = 0
print('TABUADA DE {}'.format(num))

for i in range(1, 11):
    resultadot = num * i
    print('{} x {} = {}'.format(num, i, resultadot))

# Questão 10 - Desenvolva um sistema de menu utilizando while e match-case.
print('---------------')

opcao = 0

while opcao != 4:
    print('[1] Mostrar números pares')
    print('[2] Mostrar números ímpares')
    print('[3] Mostrar tabuada')
    print('[4] Encerrar sistema')
    opcao = int(input('Escolha uma opção: '))

    match opcao:
        case 1:
            print("[Espaço para mostrar números pares]")
        case 2:
            print("[Espaço para mostrar números ímpares]")
        case 3:
            print("[Espaço para mostrar tabuada]")
        case 4:
            print("Encerrando o sistema...")
        case _:
            print("Opção inválida.")
