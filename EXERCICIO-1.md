# Exercício 1

## Configuração Inicial

1. Crie um novo Testcase através do menu "File" -> "New" -> "New Testcase".

2. Comece o processo de Capture através do menu "Marathon" -> "Record".

3. A aplicação que queremos testar vai abrir, assim como o "Marathon Control Center".

4. Ambiente-se com o menu de captura do MarathonITE.

Do lado direito deverá ver a janela Marathon Control Center.

É aqui que poderá ver em tempo real o script que está a ser gerado através do seu input.

É também no Control Center que deverá carregar no botão "Stop Recording" quando tiver terminado o processo de capture.

## Alínea a)

1. Teste todas as operações disponíveis na calculadora. Insira dígitos que achar relevantes nas caixas de texto, e carregue no botão abaixo das mesmas, para todas as operações.

Carregue no botão "Stop recording" quando tiver terminado.

2. Deverá ver o script gerado pelo MarathonITE. 

Grave o ficheiro como TestFieldsAreWorking.

Use o menu "Marathon" -> "Play" e confirme que o programa é executado e o input que lhe deu na fase de Capture é reproduzido corretamente.

## Alínea b) 

Vamos agora garantir que não só os "inputs" e os botões funcionam, mas também que o resultado das operações é o correto.

1. Crie um novo Testcase.

2. Comece uma nova captura ("Marathon" -> "Record")

3. Para cada operação da calculadora, insira dígitos que considere relevantes e carregue no botão da operação.

Use a combinação CTRL + Right Click no campo onde o resultado é mostrado.

No novo menu que é mostrado, carregue em "Insert Assertion".

Confirme que a função "assert_p" foi adicionada ao script no Marathon Control Center e feche o menu de assertion.

4. Repita o processo para todas as operações, e carregue no botão de "Stop Recording" no "Marathon Control Center".

5. Grave o ficheiro como TestOperationsResult

6. Use o menu "Marathon" -> "Play" e confirme que o teste é executado.

O MarathonITE vai confirmar que as asserções que inseriu se confirmam.


