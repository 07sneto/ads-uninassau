opcao = 0
alunos = []

while opcao != '0':
    print('\n=== SISTEMA DE ALUNOS ===')
    print('[1] Adicionar um Aluno')
    print('[2] Buscar um Aluno')
    print('[3] Listar todos os Alunos')
    print('[4] Atualizar os dados do Aluno')
    print('[5] Remover um Aluno')
    print('[0] Fechar o sistema')

    opcao = input('Escolha a opção: ')

    match opcao:
        case '1':
            print('\n[ADICIONAR ALUNO]')
            print('(Digite "voltar" para voltar ao menu)')
            addAluno = input('Nome do aluno: ')
            if addAluno.lower() == 'voltar':
                print('Voltando ao menu.')
            else:
                alunos.append(addAluno)
                print(f'Aluno "{addAluno}" adicionado com sucesso!')

        case '2':
            print('\n[BUSCAR ALUNO]')
            if alunos == []:
                print('Nenhum aluno cadastrado. Para adicionar, escolha a opção 1.')
            else:
                print('(Digite "voltar" para voltar ao menu)')
                nomeAluno = input('Digite o nome do aluno a buscar: ')
                if nomeAluno.lower() == 'voltar':
                    print('Voltando ao menu.')
                else:
                    encontrados = [a for a in alunos if nomeAluno.lower() in a.lower()]
                    if encontrados:
                        print(f'\nAlunos encontrados: {encontrados}')
                    else:
                        print('\nNenhum aluno encontrado com esse nome.')

        case '3':
            print('\n[LISTAR TODOS OS ALUNOS]')
            if alunos == []:
                print('Nenhum aluno cadastrado.')
            else:
                for i, aluno in enumerate(alunos, start=1):
                    print(f'- {aluno}')

        case '4':
            print('\n[ATUALIZAR DADOS DO ALUNO]')
            if alunos == []:
                print('Nenhum aluno cadastrado.')
            else:
                for i, nomeAluno in enumerate(alunos, start=1):
                    print(f'{i}. {nomeAluno}')

                print('(Digite "voltar" para voltar ao menu)')
                numero = input('Digite o número do aluno a atualizar: ')
                
                if numero.lower() == 'voltar':
                    print('Voltando ao menu.')
                elif numero.isdigit() and 1 <= int(numero) <= len(alunos):
                    novo_nome = input(f'Novo nome: ')
                    alunos[int(numero) - 1] = novo_nome
                    print('Aluno atualizado com sucesso!')
                else:
                    print('Número inválido.')

        case '5':
            print('\n[REMOVER ALUNO]')
            if alunos == []:
                print('Nenhum aluno cadastrado.')
            else:
                for i, nomeAluno in enumerate(alunos, start=1):
                    print(f'{i}. {nomeAluno}')

                print('(Digite "voltar" para voltar ao menu)')
                entrada = input('Digite o número do aluno a remover: ')
                
                if entrada.lower() == 'voltar':
                    print('Voltando ao menu.')
                elif entrada.isdigit() and 1 <= int(entrada) <= len(alunos):
                    removido = alunos.pop(int(entrada) - 1)
                    print(f'Aluno "{removido}" removido com sucesso!')
                else:
                    print('Número inválido.')

        case '0':
            pass

        case _:
            print('\n[OPÇÃO INVÁLIDA]')
            print('Tente novamente.')

print('\n[FECHANDO O PROGRAMA]')
