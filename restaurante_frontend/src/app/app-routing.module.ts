import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddclienteComponent } from './addcliente/addcliente.component';
import { AddpagamentoComponent } from './addpagamento/addpagamento.component';
import { AutenticacaoComponent } from './autenticacao/autenticacao.component';
import { IncluirPratosComponent } from './incluir-pratos/incluir-pratos.component';
import { ListarClientesOrdemAlfaComponent } from './listar-clientes-ordem-alfa/listar-clientes-ordem-alfa.component';
import { ListarFaturamentoComponent } from './listar-faturamento/listar-faturamento.component';
import { ListarPagamentoClienteComponent } from './listar-pagamento-cliente/listar-pagamento-cliente.component';
import { ListarPratoPorProdutoComponent } from './listar-prato-por-produto/listar-prato-por-produto.component';
import { ListarPratosIncluirPedidosComponent } from './listar-pratos-incluir-pedidos/listar-pratos-incluir-pedidos.component';
import { ListarProdutoComponent } from './listar-produto/listar-produto.component';
import { ListarpratoprontoComponent } from './listarpratopronto/listarpratopronto.component';
import { PrincipalComponent } from './principal/principal.component';
import { QuantidadePratosPorPedidoComponent } from './quantidade-pratos-por-pedido/quantidade-pratos-por-pedido.component';

const routes: Routes = [
{path: '', component: PrincipalComponent},
{path: 'addcliente', component: AddclienteComponent},
{path: 'addpagamento', component: AddpagamentoComponent},
{path: 'listarpratopronto', component: ListarpratoprontoComponent},
{path:'listarfaturamento', component:ListarFaturamentoComponent},
{path:'listarpratosincluirpedidos', component:ListarPratosIncluirPedidosComponent},
{path: 'login', component: AutenticacaoComponent},
{path:'incluirpratos', component:IncluirPratosComponent},
{path: 'listarproduto', component: ListarProdutoComponent},
{path: 'principal', component: PrincipalComponent},
{path: 'listarpagamentocliente', component: ListarPagamentoClienteComponent},
{path: 'listarpratoporproduto', component: ListarPratoPorProdutoComponent},
{path: 'listarclientesordem', component: ListarClientesOrdemAlfaComponent},
{path: 'quantidadepratosporpedido', component: QuantidadePratosPorPedidoComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
