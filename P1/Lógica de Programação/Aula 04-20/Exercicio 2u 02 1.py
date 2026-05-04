nome = input('Digite o nome do aluno: ')
nota = float(input('Digite a nota do aluno: '))
frequencia = int(input('Digite a frequência do aluno: '))
trabalho = input("Entregou o trabalho? (sim/nao): ").lower()
advertencia = input("Possui advertência disciplinar? (sim/nao): ").lower()

# Parte 1: Mostrar os dados do aluno

print('=== DADOS DO ALUNO ===')
print('Nome:', nome)
print('Nota:', nota)
print('Frequencia:', frequencia, '%')

# Parte 2: Verificar a situação do aluno

if nota >= 7 and frequencia >= 75:
    print('Situação: Aprovado')
else:
    print('Situação: Reprovado')

# Parte 3: Verificar entrega do trabalho

if trabalho == 'nao':
    print('=== TRABALHO ===')
    print('Atenção: trabalho não entregue')

# Parte 4: Verificar advertência

if advertencia == 'sim':
    print('=== ADVERTÊNCIA ===')
    print('Atenção: procurar a coordenação')

# Parte 5:

if nota >= 7 and frequencia >= 75 and trabalho == 'sim' and not advertencia == 'sim':
    print('=== SITUAÇÃO ===')
    print('Aluno em situação regular')

# Parte 6:

if (nota < 5 and frequencia < 75) or trabalho == 'nao':
    print('=== SITUAÇÃO ===')
    print('Situação crítica')