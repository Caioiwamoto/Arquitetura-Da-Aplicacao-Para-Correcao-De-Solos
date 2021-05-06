# Arquitetura Da Aplicação Para Correção De Solos
<p>
Projeto demandado pelo IDR-Paraná, que visa desenvolver a Arquitetura da aplicação para correção de solos. O objetivo principal é identificar cada componente que precisa ser aplicado no solo de acordo com o seu estado atual. Este projeto é orientado pelo Professor Dr. Gabriel Costa Silva para a disciplina de Arquitetura de Software e será desenvolvido na linguagem de programação Java.
</p>
 
### RELATÓRIO DE AJUSTES NO CÓDIGO
1. Código do projeto antes das mudanças
      <section> 
        <p> * PROJETO <p>
        <img src="Imagens/AntesProjeto.png" width="750" title="hover text" align="center"/>
      </section>
      <section> 
       <p> * CLASSE RECUPERACAO E CORRECAO DO FÓSFORO </p>
        <img src="Imagens/AntesFosforo.png" width="750" title="hover text"  align="center"/>
      </section>
      <section> 
        <p> * CLASSE RECUPERACAO E CORRECAO DO POTÁSSIO <p>
        <img src="Imagens/antesPotassio.png" width="750" title="hover text"  align="center"/>
      </section>

2. Problemas identificados
      <section>
        <p> * Condicionais repetidas </p>
        <p> * Estrutura do switch defasada e extensa </p>
        <p> * Métodos construturoes inviáveis</p>
        <p> * Variáveis constantes sem a utlização de Enum </p>
      </section>
        
3. Soluções encontradas
     <section>
       <p> * Unificar as condionais repetidas <p>
       <p> * Atualizar a estrutura do switch <p>
       <p> * Criar uma classe Enum para diminuir a extensão dos switch </p>
       <p> * Remover os métodos construturoes da classe </p>
     </section>
     
4. Referências dos commits
   <section> 
      * <a href="https://github.com/LeonardoSMateus/Arquitetura-Da-Aplicacao-Para-Correcao-De-Solos/commit/e98851f88fe814204cd09af1bcd0690f40e12ab3"> Modificações na Classe Correção e Recuperação Do Fósforo </a>
      <br/>
      * <a href="https://github.com/LeonardoSMateus/Arquitetura-Da-Aplicacao-Para-Correcao-De-Solos/commit/972e8609f20ce55bda6f119334fc942ba9f17ba7"> Modificações na Classe Correção e Recuperação Do Potássio </a>
   </section>
   
5. Código do projeto depois das mudanças
 
      <section> 
        <p> * PROJETO </p>
        <img src="Imagens/DepoisProjeto.png" width="750" title="hover text"  align="center"/>
      </section>
      <section> 
        <p> * CLASSE RECUPERACAO E CORRECAO DO FÓSFORO </p>
        <img src="Imagens/DepoisFosforo.png" width="750" title="hover text"  align="center"/>
      </section>
      <section> 
        <p> * CLASSE RECUPERACAO E CORRECAO DO POTÁSSIO </p>
        <img src="Imagens/depoisPotassio.png" width="750" title="hover text"  align="center"/>
      </section>

     # Relatório - Atividade #4
A atividade teve como objetivo criar três testes que simulam os quadros de teores do solo, correção/recuperação de fósforo, e correção/recuperação de potássio.
Abaixo serão destacados os problemas e as devidas soluções encontradas para cada caso, seguidos de seus commits.

<ul>
       <li><p> <b>Dificuldades/problemas encontrados: </b></li>
              1- Ao clonar o repositório e rodar a implementação, a mesma não compilou, foi necessário adicionar alguns plugins no arquivo <i>pom.xml</i> para fazer o código funcionar - <a href="https://github.com/Caioiwamoto/Arquitetura-Da-Aplicacao-Para-Correcao-De-Solos/commit/01972bb8d14852628618cb9b308485d05f81ce75">commit</a>. <br> 
              2- O código apresentou um problema de expressões ilegais, que ocasionava em valores inválidos para a realização dos testes, a solução foi trocar as "->" por ":" nas funções de switch case - <a href="https://github.com/Caioiwamoto/Arquitetura-Da-Aplicacao-Para-Correcao-De-Solos/commit/6a78a01fc0f460ba0f6188828cd065d70bd63368">commit</a>. <br>
              3- Há muitas estruturas estruturas condicionais no código (switch case), o que prejudica a manutenabilidade. <br>
              4- Estava faltando realizar os testes dos cálculos de custo do alqueire para cada fonte de fósforo - <a href="https://github.com/Caioiwamoto/Arquitetura-Da-Aplicacao-Para-Correcao-De-Solos/commit/6a78a01fc0f460ba0f6188828cd065d70bd63368">commit</a>.<br>
              Obs: os testes faltantes foram implementados somente no arquivo para a realização desta atividade <i>Tests.java</i>.<br>
           </p>

</ul>  

