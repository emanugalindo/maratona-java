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
- Exceções

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
- Ela tem como delimitador padrão o espaço em branco;
- **.useDelimiter("delimitador"):** define um delimitador para ser utilizado ao invés do delimitador padrão.

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

### 🔹 Exceções
- **Exceção** é um evento que ocorre durante a execução de um programa e interrompe o fluxo normal de execução;
- **Exceções do tipo Checked**, são exceções que são filhas da classe **Exception** diretamente. Se não tratadas, vão lançar um erro em tempo de compilação;
- **Exceções do tipo Unchecked**, são exceções filhas ou a classe **RuntimeException**. Você não precisa fazer validação para o seu código compilar;
- **Exemplo de tratamento de exceção**:
```
File file = new File("arquivo/teste.txt");  
try {  
    boolean isCriado = file.createNewFile();  
    System.out.println("Arquivo criado " + isCriado);  
} catch (IOException e) {  
    e.printStackTrace();
}
```
- A **StackTrace** mostra no console tudo o que ocorreu;
- **IllegalArgumentException:** exceção de argumento ilegal ou inapropriado;
- Quando trabalhamos com exceções **Checked** é necessário colocar o **throws** na assinatura do método. **Ex:**
```
private static void talvezLanceException() throws SQLException, FileNotFoundException{  

}
```
- **Finally:** sempre é executado, independente de ter uma exceção ou não;
    - Recomendado quando é necessário fechar um recurso após o uso dele.
- Você deve usar o **try + catch ou finally**;
- Quando são utilizados diversos **catches**, não podemos colocar o tipo mais genérico da exceção na frente dos outros **catches**. Ele deve vir no final, pois se ele vier antes de outra exceção a referência do objeto vai ir direto para ele;
- Você pode colocar exceções que não estão na mesma linha de herança dentro de um mesmo catch, se elas estiverem separadas por **|**. Você não pode fazer isso com classes na mesma linha de herança;
- **Try with resources:** se encarrega de fechar a conexão da variável de referência.
    - Você só pode colocar objetos/variáveis de referência dentro dele que implementem a interface **Closable ou Autoclosable**.
    - Com ele, você pode deixar apenas o **try**, mas você precisa indicar a exceção do tipo **Checked** que está sendo lançada.
    - Podemos colocar mais de um(a) objeto/variável e eles são fechados na ordem inversa que foram declarados.
- **Ex:**
```
try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){  
  
}catch (IOException e){  
  
}
```
- Quando você está sobrescrevendo um método, você não é obrigado a declarar as mesmas exceções que aquele método está declarando. Pois, a funcionalidade da sobrescrita pode ser completamente diferente;
    - Você pode lançar uma ou todas as exceções;
    - Você pode lançar qualquer exceção Unchecked;
    - Você não pode declarar uma exceção mais genérica do que a do tipo original, porém se no método original tiver uma mais genérica você pode colocar as classes filhas;
    - Você não pode colocar uma exceção do tipo **Checked** que não foi declara no método original;

### 🔹 Wrappers
-  São objetos que irão encapsular os tipos primitivos;
- Para criar um **Wrapper**, você coloca o nome do tipo primitivo em maiúscula. Com exceção do **int** e do **char**;
- **Wrappers: Byte, Short, Integer, Long, Float, Double, Character, Boolean;**
- **Autoboxing** é quando você tem um tipo primitivo e você faz o Java transformar ele em **Wrapper**;
- **Unboxing** é quando o Java transforma o Wrapper em tipo primitivo;

### 🔹 Strings
- No Java, **Strings** são imutáveis. A não ser que você faça uma nova associação, você não pode trocar o valor que existe;
- As Strings quando são criadas pela primeira vez, ficam na **String constant pool**;
- Para se comparar se referências de Strings apontam para o mesmo objeto, usa-se **==**;
- **.concat():** usa-se para concatenar Strings;
- Quando você cria uma String usando **new String()**, você cria: 1 - variável de referência, 2 - objeto do tipo string, 3 - uma string no pool de string;
    - Se quisermos pegar o valor de referência do pool de string, usamos **.intern();
- **.lenght():** mostra o tamanho da String;
- **replace("letra_a_ser_trocada", "letra_nova"):** troca todas as ocorrências da letra informada por outra letra informada;
- **.substring(posicao_inicial, posicao_final):** retorna a string a partir do índice inicial até um índice a menos do que o índice final informado;
    - Se você usar de uma posição até o final da string, não é preciso informar o índice final;
- **.trim():** remove os espaços em branco do começo e do fim da string;
- **StringBuffer e StringBuilder** são utilizados para melhorar o desempenho de Strings;
    - **append(concatenar_com_string):** concatena a string;
    - **StringBuilder** não é imutável;
    - Quando você cria uma **StringBuilder/StringBuffer**, você pode passar uma string, uma sequência de caracteres ou a capacidade dela. Se você não passar nada é criada uma com **16 caracteres**, e caso você passe do tamanho ele é dobrado;
    - **.reverse():** inverte a StringBuilder;
    - **.delete(inicio, fim):** deleta as posições a partir da inicial até a anterior da final informada.

### 🔹 Date
- Usada em sistemas legados;
- Trabalha em milissegundos;
- O valor que tem dentro dela é um **long** representando os milissegundos desde de **01/01/1970**;
- **.getTime():** retorna um long que representa a data;

### 🔹 Calendar
- É uma classe abstrata;
- Instância: ```Calendar nome = Calendar.getInstance();```
- **.add(valor_para_adicionar, quantidade):** adiciona um valor de hora, ou ano ao atual;
- **.roll(valor_para_adicionar, quantidade):** adicionar um valor, mas se passar do limite de ano ou dia, adiciona e mantém ele.

### 🔹 DateFormat
- Usada para formatar datas;
- É abstrata;
- **Instância:** ```DateFormat[] nome = new DateFormat[tamanho];```
- Exemplos de formatações:
```
df[0] = DateFormat.getInstance();  
df[1] = DateFormat.getDateInstance();  
df[2] = DateFormat.getDateTimeInstance();  
df[3] = DateFormat.getDateInstance(DateFormat.SHORT);  
df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);  
df[5] = DateFormat.getDateInstance(DateFormat.LONG);  
df[6] = DateFormat.getDateInstance(DateFormat.FULL);
```

### 🔹 Locale
- Foi criada para trabalhar com internacionalização;
- Usada para formatar datas, moedas e números baseado na preferência do usuário ou na localização da **JVM** dele;
- Ele utiliza duas ISOs, língua e país;
- **Ex:** ```Locale nome = new Locale("língua", "país");```
- **.getDisplayCountry()/.getDisplayCountry(país):** mostra o nome de um determinado país com base no país do usuário ou de um informado;
- **.getDefault():** mostra como está configurado o país e idioma do seu computador;
- **.getISOCountries():** exibe a lista de países suportados;
- **.getISOLanguages():** exibe a lista de línguas suportadas;

### 🔹 NumberFormat
- É abstrata;
- **Instância:** ```NumberFormat.getInstace();```
    - Para moedas: ```NumberFormat.getCurrencyInstace();```
- .**getMaximumFractionDigits():** mostra a quantidade máxima de casas decimais;
- **.getMaximumIntegerDigits():** mostra a quantidade máxima de inteiros;
- **.setMaximumFractionDigits(quantidade):** define a quantidade máxima de casas decimais.
- **.parse():** converte o valor da String para a representação informada;
    - Para moedas, é necessário colocar com o símbolo da moeda.

### 🔹 SimpleDateFormat
- Com ela, pode-se formatar de diversas formas;
- Pode-se passar uma **máscara** para definir o formato de exibição. **Ex:** ```SimpleDateFormat sdf = new SimpleDateFormat(pattern);
- Usa-se **'** quando é necessário que o que está dentro das aspas simples seja ignorado;
- Com o **parse** é necessário seguir a representação informada.

### 🔹 LocalDate
- Trabalha apenas com a data;
- Exibe a data igual ela é salva no banco de dados;
- Ela é imutável;
- Quando ela é instanciada, pode ser com **.of(), .now() ou .parse()**;
- **isLeapYear():** retorna se o ano é bissexto ou não;
- **.atTime(LocalTime):** faz a junção de uma LocalDate com uma LocalTime.

### 🔹 LocalTime
- Trabalha apenas com hora;
- Pode ser instanciada com **.of(), .now() ou .parse()**;
- Vai de 0 até 23 horas;
- **LocalTime.MIN:** mostra a hora mínima(00:00);
- **LocalTime.MAX:** mostra a hora máxima(23:59:59);
- **.atDate(LocalDate):** faz a junção de uma LocalTime com uma LocalDate.

### 🔹 LocalDateTime
- Trabalha com data e hora;
- Pode ser instanciado com **.now(), .of() ou .parse()**;

### 🔹 Instant
- Trabalha com nanossegundos, guarda eles de 1970 até agora;
- Os objetos criados são imutáveis;
- **.ofEpochSecond(epochSecond)/.ofEpochSecond(epochSecond, nanoAdjustment):** mostra o segundo informado, podendo ou não adicionar nanossegundos para aumentá-lo ou diminuí-lo;

### 🔹 Duration
- Criada para trabalhar com a quantidade de tempo;
- Geralmente é utilizada quando é necessário pegar o intervalo entre duas datas;
- Baseada em segundos e nanossegundos;
- **.between():** exibe a diferença entre datas ou horas diferentes;
- Retorna em horas;

### 🔹 Period
- Baseada na data;
- Trabalha com dias, meses e anos;
- **.between(LocalDate dt1, LocalDate dt2):** retorna o período entre duas LocalDate;

### 🔹 Regex
- É uma linguagem que utiliza metacaracteres;
- Encontra padrões em um texto;
- Também é usada para validações;
- **Pattern:** padrão a ser encontrado;
- **Matcher:** compara o Pattern com o texto;
- **Pattern.compile(regex):** guarda o padrão;
- **Pattern.matcher(texto):** compara o texto com o padrão guardado;
- **Matcher.find():** encontra as ocorrências do padrão;
- **Matcher.start():** retorna o **índice** referente ao começo da ocorrência;
    - Os elementos encontrados são descartados para novas ocorrências. Então, se houver uma nova e algum deles fizer parte, ela não é exibida.
- **Matcher.group():** exibe a ocorrência encontrada.
- **\d :** Todos os dígitos;
- **\D :** Tudo o que não for dígito ;
- **\s :** Espaços em branco **\t \n \f \r** ;
- **\S :** Todos os caracteres excluindo os brancos;
- **\w :**  a-Z A-z, dígitos, _ ;
- **\W :** Tudo o que não for incluso no \w;
- **[]**: range, o que está dentro dele irá ser buscado;
    - **a-z:** são buscados os caracteres de a até z **minúsculos**;
    - **A-z:** são são buscados os caracteres de a até z **maiúsculos**;

#### Quantificadores
- São caracteres em que você pode pegar  determinada expressão baseada na quantidade que o metacaractere representa;
- **? :** Zero ou uma;
* * : zero ou mais;
+ **+:** uma ou mais;
- **{n,m} :** de n até m;
- **():** agrupamento;
- **|:** para ou;
- **$:** fim da linha;
- **.(coringa):** corresponde a qualquer caractere único, exceto quebra de linha;
- **^**: encontra exatamente aquilo que você quer no começo da linha;
    - Se utilizarmos ele com o **Range**, ele funciona como negação.

### 🔹 File
- **File.createNewFile():** cria um arquivo;
    - Se ele já estiver sido criado, não é criado outro com o mesmo nome.
- **File.delete():** apaga um arquivo;
- **File.exists():** verifica se um arquivo existe;
- **File.getPath():** retorna o nome do arquivo;
-  **File.getAbsolutePath():** retorna o caminho absoluto do arquivo;
- **File.isDirectory():** retorna se ele é um diretório ou não;
-  **File.isFIile():** retorna se ele é um arquivo ou não;
- **File.isHidden():** mostra se ele está oculto;
- **File.lastModified():** mostra a última vez que ele foi modificado.

### 🔹 FileWriter
- **File.write():** escreve no arquivo;
- **File.flush():** força a escrita imediata de dados do buffer interno para o arquivo no disco, garantindo que nada seja perdido antes do **close()**;
- Se quisermos que seja escrito continuando com o que está no arquivo devemos colocar **true** no construtor.
    - **Ex: `FileWriter fw = new FileWriter(file, true);`

### 🔹 FileReader
- Usado para ler arquivos;
- **FileReader.read():** retorna o número de caracteres lidos. Quando você não usa o array nele, é retornado o valor decimal do caractere;
    - Você pode pegar todo o conteúdo do arquivo com ele.
---

Feito com ❤️ por [Emanuel Galindo](https://github.com/emanugalindo).