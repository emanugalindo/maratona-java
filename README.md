# 🚀 Maratona Java - Curso DevDojo

Repositório dedicado aos estudos de Java, seguindo o curso [Maratona Java](https://www.youtube.com/playlist?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW) do DevDojo.  
**Objetivo**: Dominar conceitos de POO, estruturas de dados e boas práticas para desenvolvimento back-end.

---

## 📌 Progresso Atual

### ✅ Tópicos Concluídos
- Fundamentos: variáveis, operadores, controle de fluxo
- Estruturas Condicionais: if, else, switch
- Estruturas de Repetição: for, while, do-while
- Arrays e Arrays Multidimensionais
- POO

## 📚 Anotações
### 🔹 Tipos Primitivos
- São oito tipos primitivos. Sendo eles:  **int, double, float, char, byte, short, long, boolean**;
- No **char** também é possível colocar número. Se, você colocar um número ele é traduzido para a tabela ASCII. Pode também usar a tabela **unicode**. Basta colocar '\u+valor'.
  - **Ex:**  '\u0041' = A;
- No **float** quando usado para número decimais deve ser colocar **F** ou **f**. Pois o compilador não sabe se tem espaço. No double pode ser colocado o **D** ou **d**, mas não é necessário.
- **Cast** é quando você força o Java a colocar o valor de uma variável dentro de outra.
  - **Ex:** int idade = (int) 10000000000L;

### 🔹 Estruturas Condicionais
#### Operador Ternário

- Sempre vai associar um valor diretamente para uma variável ou um retorno de método;
- Sintaxe: **(condição) ? verdadeiro : falso**
  **Ex:
  ```String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;```
- O tipo da variável precisa bater.

### 🔹 Arrays
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
```	
int[] numeros = new int[3];  
int[] numeros2 = {1,2,3,4,5};  
int[] numeros3 = new int[]{1,2,3,4,5};	
```
- **Foreach:**
```
for(int num:numeros3){  
    System.out.println(num);  
}
```

### 🔹 POO
- **Funções** em Java são chamados de **Métodos**;
- Quando você cria um método, o que está dentro dos parênteses é chamado de **Parâmetro**. Já, quando você chama ele, é chamado de **Argumento**;
- Quando um método tiver o retorno, não é necessário ter o else, se usarmos o if.
  - **Ex**:
```
if(num2 == 0) {
  return 0;  
}  
return num1 / num2;
```
- Nos **métodos void**, se utilizarmos o **return** dentro de um if, não é executado o que está fora dele;
- Quando você passa valores dos **tipos primitivos** como **Argumentos** é feita uma cópia deles. Já quando é usado valores do **tipo reference** você passa a referência do objeto(onde ele está guardado).

#### Varargs
- Permitem que um método receba um número variável de argumentos do mesmo tipo;
- Sintaxe: tipo... + nome (int... numeros);
- **Ex:** calculadora.somaVarArgs(1,2,3,4,5,6,7);
- Se trabalharmos com mais de um parâmetro o varargs precisa ser o último.

#### Sobrecarga de Métodos
- É você ter um método com o mesmo nome de outro, mas o tipo ou a quantidade de parâmetros é diferente.

#### Construtores
- São métodos especiais usados para inicializar objetos de uma classe;
- Os construtores não podem ter nenhum tipo de retorno;
- Ele é executado antes de qualquer método da classe;
- Usa-se **this();** para chamar um construtor. Mas ele só funciona se estiver dentro de um construtor. Obrigatoriamente precisa ser a primeira linha executável do construtor quando o utilizamos.

#### Blocos de inicialização
- São blocos que são executados antes de métodos todas as vezes que forem criadas instancias de um objeto;
- Recomenda-se colocá-lo depois das variáveis;
- **Sintaxe:
```
{
	código
}
```
- Quando eles forem **static** são executados apenas uma vez. São executados antes do objeto. Se tiver mais de um, são executados na ordem que aparecem.

#### Scanner
- Utilizado para ler dados pelo teclado;
- **Sintaxe: Scanner nome = new Scanner(System.in);**
- .next() lê apenas a primeira palavra. Já, o .nextLine() lê tudo;
- Para usar com char devemos utilizar o nome do scanner + charAt(posição).
  - **Ex: entrada.next().charAt(0);

#### Super
- Utiliza-se para acessar métodos de super classes em que você quer utilizá-lo com alguma adição, sem ter que fazer uma Sobrecarga dele;
- Precisa ser a primeira linha do construtor;
- Não pode tê-lo e o this no mesmo construtor;
- **Sintaxe: super.+ método;**

#### Protected
- É um modificador de acesso onde as subclasses de uma classe e as classes que estão nome mesmo pacote que ela podem acessar atributos dela.

#### toString()
- Usa-se para retornar os dados de um objeto;
- Pode ser utilizado para printar os dados do objeto com ou sem ele se utilizarmos apenas o nome do objeto;
- Na sobrescrita dele, o nome precisa ser exatamente o mesmo, a quantidade de parâmetros tem que ser a mesma, o tipo de retorno tem que ser exatamente a classe ou alguma subclasse(covariância de retorno) e o modificador de acesso nunca pode ser mais restritivo(você não pode tirar os privilégios).
- 
#### @Override
- Garante que o método de uma classe está sobrescrevendo o da super classe;
- Coloca-se ele na linha acima do método.
- 
#### Constantes
- São valores que, uma vez atribuídos, não podem ser modificados ao longo da execução do programa.
- Usa-se **final** para definir uma constante;
  - **Ex: ```public static final double VELOCIDADE_LIMITE = 250;```
- O nome dela precisa ser em **maiúsculo** e, se tiver mais de uma palavra elas precisam ser separadas por underline;
- Elas precisam ser inicializadas;
- Geralmente é acompanhada pelo método **static**;
- Quando usamos com variáveis do tipo reference, a associação não pode ser mudada. Mas, os dados sim;
- Quando não queremos que uma classe seja estendida podemos colocar o **final** antes do class.
  - **Ex: ```public final class Carro(){}```
- **String** é uma classe final;
- Não podemos sobrescrever métodos que tenham **final**.
- 
#### Enumeração
- É uma classe onde colocamos dados que são constantes;
- **Sintaxe: ```public enum NomeClasse {}```
- **Ex:
```
public enum TipoCliente {
	PESSOA_FISICA,
	PESSOA_JURIDICA
}
```
- Para adicionar em um objeto é só colocar **nomeEnum.DADO**;
- Dentro de uma classe podemos criar uma enumeração;
  - Para acessá-lo, usamos o **nomeClasse.nomeEnum.nomeDado**. Ou importá-lo, ficando assim: **nomeEnum.nomeDado**;
- Quando temos um atributo sem modificador de acesso, ele pode ser acessado somente pelas classes que estão no mesmo pacote que a dele;
- Quando usamos uma enumeração é criado um construtor;
- Podemos usar depois dos dados **(valor)** valores para simplificarmos o uso com banco de dados.
  - Podemos usá-lo com **final** ou não. Se não utilizarmos final devemos colocá-lo como private e adicionarmos o get;
  - Podemos utilizar mais de um valor.
- **Ex:**
```
public enum TipoCliente {
	PESSOA_FISICA(1),
	PESSOA_JURIDICA(2)
	public final int VALOR;

	TipoCliente(int valor){
		this.VALOR = valor;
	}
}
```
- Se colocarmos **{}** depois do dado, podemos sobrescrever métodos do enum.

#### Interfaces
- Uma _interface_ é um tipo de referência, semelhante a uma classe, que pode conter _apenas_ constantes, assinaturas de método, métodos padrão, métodos estáticos e tipos aninhados.
- Por padrão os métodos delas são públicos e abstratos;
- Utiliza-se **implements** ao invés de **extends**;
- Pode-se implementar diversas interfaces em uma classe;
- Se você quiser que um método não seja abstrato é necessário colocar **default**, por padrão ele continua público. Introduzido no Java 8;
- Não podemos criar objetos de interfaces;
- Na classe que está implementado a interface, não podemos colocar um modificador de acesso mais restritivo do que o que está sendo usado na interface;
- Por padrão os **atributos** são constantes;
- A partir do **Java 8** pode-se adicionar métodos estáticos;

#### Polimorfismo
- É a capacidade de um objeto ser tratado como uma instância de sua própria classe ou de suas classes pai (superclasses);
- Com o polimorfismo podemos ter a variável de referência de um tipo e o objeto de outro. Isso só é aplicado na **herança**;
---

Feito com ❤️ por [Emanuel Galindo](https://github.com/emanugalindo).