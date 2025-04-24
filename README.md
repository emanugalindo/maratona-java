## Sobre

Repositório onde estou guardando os 
arquivos dos meus estudos em Java e minhas anotações.

## Tipos Primitivos
- São oito tipos primitivos. Sendo eles:  **int, double, float, char, byte, short, long, boolean**;
- No **char** também é possível colocar número. Se, você colocar um número ele é traduzido para a tabela ASCII. Pode também usar a tabela **unicode**. Basta colocar '\u+valor'.
    - **Ex:**  '\u0041' = A;
- No **float** quando usado para número decimais deve ser colocar **F** ou **f**. Pois o compilador não sabe se tem espaço. No double pode ser colocado o **D** ou **d**, mas não é necessário.
- **Cast** é quando você força o Java a colocar o valor de uma variável dentro de outra.
    - **Ex:** int idade = (int) 10000000000L;

## Estruturas Condicionais
### Operador Ternário

- Sempre vai associar um valor diretamente para uma variável ou um retorno de método;
- Sintaxe: **(condição) ? verdadeiro : falso**
  **Ex:
  ```String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;```
- O tipo da variável precisa bater.

## Arrays
- Sintaxe:
  ``` int[] idades;```
  OU
  ``` int idades[];```
- Os Arrays são do tipo Reference;
- Ela pode ser iniciada como **null**;
- Declaração:
  ```int [] idades = new int[3];```
    - Dentro dos colchetes depois de new você tem que colocar o tamanho, pois em Java é obrigatório.
- **Padrões**:
    - byte, short, int, long, float e double = 0;
    - char '\u0000' ' ';
    - boolean false;
    - String null (Qualquer valor do tipo Reference)
- Maneiras de inicializar um Array:
```	int[] numeros = new int[3];  
	int[] numeros2 = {1,2,3,4,5};  
	int[] numeros3 = new int[]{1,2,3,4,5};	
```
- **Foreach:**
```
for(int num:numeros3){  
    System.out.println(num);  
}
```

## POO
- **Funções** em Java são chamados de **Métodos**;
- Quando você cria um método, o que está dentro dos parênteses é chamado de **Parâmetro**. Já, quando você chama ele, é chamado de **Argumento**;
- Quando um método tiver o retorno, não é necessário ter o else, se usarmos o if.
    - **Ex**:
```
		if (num2 == 0) {  
    return 0;  
}  
return num1 / num2;
```
- Nos **métodos void**, se utilizarmos o **return** dentro de um if, não é executado o que está fora dele;
- Quando você passa valores dos **tipos primitivos** como **Argumentos** é feita uma cópia deles. Já quando é usado valores do **tipo reference** você passa a referência do objeto(onde ele está guardado).