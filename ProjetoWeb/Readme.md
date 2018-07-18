Passo 1
Criar um Projeto Web do Zero

Passo 2
Preparar o servidor de aplicação do projeto
Se for na mesma Workspace já haverá o servidor, bastará adicionar a aplicação.
Preparar também a importação do jar do servlet.

Passo 3
Criar uma classe chamada Produto
como br.com.praticaweb.model.Produto
Deve ter: Codigo, Nome, Valor e Fabricante


Passo 4
Criar uma classe de Servlet que será o início da execução.
Esta classe pode ser br.com.praticaweb.servlet.HomeServlet
Mapear esta classe do web.xml.


Passo 5
Na classe de Servlet no método doGet, que será iniciado logo de largada,
você deverá verificar se já existe na Session uma variável chamada "produtos".
Se já existir não faça nada.
Se não, instancie um ArrayList de Produtos e preencha esta lista com 
alguns produtos iniciais.
Além disto, no método doGet, deve ser invocado um arquivo chamado home.jsp,
que deve mostrar dois links:
- Listar produtos
- Cadastrar novo produto


Passo 6
Criar um segundo servlet chamado ListagemProdutosServlet.
Mapear esta classe do web.xml.
No método doGet desta classe deve ser chamado o arquivo lista-produtos.jsp
Neste arquivo devem ser listados todos os produtos contidos na Session,
numa tabela simples
<table>
<tr>
<td>Código</td>
<td>Produto</td>
<td>Fabricante</td>
<td>Valor</td>
</tr>
</table>
Neste arquivo também deve existir um Link que retorne à home.
Passo 7
No arquivo home.jsp, direcionar o link de Listagem para a rota criada
no mapeamento para o servlet ListagemProdutosServlet.
Passo 8
Criar um terceiro servlet chamado CadastroProdutoServlet.
Mapear esta classe do web.xml.
No método doGet desta classe deve ser chamado o arquivo novo-produto.jsp
Neste arquivo deve ser montado um form, que contenha os campos necessários
para inclusão de um novo produto.
O form deve postar para o próprio servlet CadastroProdutoServlet.
No método doPost deste servlet deve ser feita a adição do novo produto
na session antes alimentada.
Ao final deve ser direcionado para o servlet da home.
Neste arquivo também deve existir um Link que cancela a inclusão
e retorna à home.
Passo 9
No arquivo home.jsp, direcionar o link de Cadastro para a rota criada
no mapeamento para o servlet CadastroProdutoServlet.