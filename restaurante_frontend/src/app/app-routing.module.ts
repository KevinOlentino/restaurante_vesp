import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddclienteComponent } from './addcliente/addcliente.component';
import { AddpagamentoComponent } from './addpagamento/addpagamento.component';
import { AutenticacaoComponent } from './autenticacao/autenticacao.component';
import { IncluirPratosComponent } from './incluir-pratos/incluir-pratos.component';
import { ListarFaturamentoComponent } from './listar-faturamento/listar-faturamento.component';
import { ListarPratosIncluirPedidosComponent } from './listar-pratos-incluir-pedidos/listar-pratos-incluir-pedidos.component';
import { ListarProdutoComponent } from './listar-produto/listar-produto.component';
import { ListarpratoprontoComponent } from './listarpratopronto/listarpratopronto.component';
import { PrincipalComponent } from './principal/principal.component';

const routes: Routes = [
{path: '', component: PrincipalComponent},
{path: 'addcliente', component: AddclienteComponent},
{path: 'addpagamento', component: AddpagamentoComponent},
{path: 'listarpratopronto', component: ListarpratoprontoComponent},
{path:'listarfaturamento', component:ListarFaturamentoComponent},
{path:'listarpratosincluirpedidos', component:ListarPratosIncluirPedidosComponent},
{path: 'login', component: AutenticacaoComponent},
{path:'incluirpratos', component:IncluirPratosComponent},
{path: 'listarproduto', component: ListarProdutoComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
