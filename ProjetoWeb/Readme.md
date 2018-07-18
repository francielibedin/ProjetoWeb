Passo 1
Criar um Projeto Web do Zero

Passo 2
Preparar o servidor de aplica��o do projeto
Se for na mesma Workspace j� haver� o servidor, bastar� adicionar a aplica��o.
Preparar tamb�m a importa��o do jar do servlet.

Passo 3
Criar uma classe chamada Produto
como br.com.praticaweb.model.Produto
Deve ter: Codigo, Nome, Valor e Fabricante


Passo 4
Criar uma classe de Servlet que ser� o in�cio da execu��o.
Esta classe pode ser br.com.praticaweb.servlet.HomeServlet
Mapear esta classe do web.xml.


Passo 5
Na classe de Servlet no m�todo doGet, que ser� iniciado logo de largada,
voc� dever� verificar se j� existe na Session uma vari�vel chamada "produtos".
Se j� existir n�o fa�a nada.
Se n�o, instancie um ArrayList de Produtos e preencha esta lista com 
alguns produtos iniciais.
Al�m disto, no m�todo doGet, deve ser invocado um arquivo chamado home.jsp,
que deve mostrar dois links:
- Listar produtos
- Cadastrar novo produto


Passo 6
Criar um segundo servlet chamado ListagemProdutosServlet.
Mapear esta classe do web.xml.
No m�todo doGet desta classe deve ser chamado o arquivo lista-produtos.jsp
Neste arquivo devem ser listados todos os produtos contidos na Session,
numa tabela simples
<table>
<tr>
<td>C�digo</td>
<td>Produto</td>
<td>Fabricante</td>
<td>Valor</td>
</tr>
</table>
Neste arquivo tamb�m deve existir um Link que retorne � home.
Passo 7
No arquivo home.jsp, direcionar o link de Listagem para a rota criada
no mapeamento para o servlet ListagemProdutosServlet.
Passo 8
Criar um terceiro servlet chamado CadastroProdutoServlet.
Mapear esta classe do web.xml.
No m�todo doGet desta classe deve ser chamado o arquivo novo-produto.jsp
Neste arquivo deve ser montado um form, que contenha os campos necess�rios
para inclus�o de um novo produto.
O form deve postar para o pr�prio servlet CadastroProdutoServlet.
No m�todo doPost deste servlet deve ser feita a adi��o do novo produto
na session antes alimentada.
Ao final deve ser direcionado para o servlet da home.
Neste arquivo tamb�m deve existir um Link que cancela a inclus�o
e retorna � home.
Passo 9
No arquivo home.jsp, direcionar o link de Cadastro para a rota criada
no mapeamento para o servlet CadastroProdutoServlet.