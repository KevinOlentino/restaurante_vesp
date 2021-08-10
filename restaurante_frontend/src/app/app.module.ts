import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule} from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddclienteComponent } from './addcliente/addcliente.component';
import { FormsModule, NgForm } from '@angular/forms';
import { AddpagamentoComponent } from './addpagamento/addpagamento.component';
import { PrincipalComponent } from './principal/principal.component';
import { ListarpratoprontoComponent } from './listarpratopronto/listarpratopronto.component';
import { ListarFaturamentoComponent } from './listar-faturamento/listar-faturamento.component';
import { ListarPratosIncluirPedidosComponent } from './listar-pratos-incluir-pedidos/listar-pratos-incluir-pedidos.component';
import { AutenticacaoComponent } from './autenticacao/autenticacao.component';
import { IncluirPratosComponent } from './incluir-pratos/incluir-pratos.component';
import { ListarProdutoComponent } from './listar-produto/listar-produto.component';
import { ListarPagamentoClienteComponent } from './listar-pagamento-cliente/listar-pagamento-cliente.component';
import { ListarPratoPorProdutoComponent } from './listar-prato-por-produto/listar-prato-por-produto.component';
import { ListarClientesOrdemAlfaComponent } from './listar-clientes-ordem-alfa/listar-clientes-ordem-alfa.component';
import { QuantidadePratosPorPedidoComponent } from './quantidade-pratos-por-pedido/quantidade-pratos-por-pedido.component';
import { ListarFuncionarioComponent } from './listar-funcionario/listar-funcionario.component';
import { IncluirFuncionarioComponent } from './incluir-funcionario/incluir-funcionario.component';
import { ListarSetorComponent } from './listar-setor/listar-setor.component';
import { IncluirSetorComponent } from './incluir-setor/incluir-setor.component';
import { ListarVeiculoComponent } from './listar-veiculo/listar-veiculo.component';
import { IncluirVeiculoComponent } from './incluir-veiculo/incluir-veiculo.component';
import { ListarFornecedorComponent } from './listar-fornecedor/listar-fornecedor.component';
import { IncluirFornecedorComponent } from './incluir-fornecedor/incluir-fornecedor.component';
import { ListarEntregaComponent } from './listar-entrega/listar-entrega.component';
import { IncluirEntregaComponent } from './incluir-entrega/incluir-entrega.component';

@NgModule({
  declarations: [
    AppComponent,
    AddclienteComponent,
    AddpagamentoComponent,
    PrincipalComponent,
    ListarpratoprontoComponent,
    ListarFaturamentoComponent,
    ListarPratosIncluirPedidosComponent,
    AutenticacaoComponent,
    IncluirPratosComponent,
    ListarProdutoComponent,
    ListarPagamentoClienteComponent,
    ListarPratoPorProdutoComponent,
    ListarClientesOrdemAlfaComponent,
    QuantidadePratosPorPedidoComponent,
    ListarFuncionarioComponent,
    IncluirFuncionarioComponent,
    ListarSetorComponent,
    IncluirSetorComponent,
    ListarVeiculoComponent,
    IncluirVeiculoComponent,
    ListarFornecedorComponent,
    IncluirFornecedorComponent,
    ListarEntregaComponent,
    IncluirEntregaComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
