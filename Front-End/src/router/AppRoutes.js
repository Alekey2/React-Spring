import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Home from '../pages/ladding-page';
import Cadastro from '../pages/page-cad';
import Login from '../pages/page-login';
import RecSenha from '../pages/pag-recup';
import Shopping from '../pages/page-shopping';
import Carrinho from '../pages/my-cart';
import Produto from '../pages/page-prod';
import CadastroProduto from '../pages/cadProd';
import ListaProdutos from '../pages/list-prod';

export default function AppRoutes(){
    return(
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Home/>}/>
                <Route path="/cadastro" element={<Cadastro/>}/>
                <Route path="/login" element={<Login/>}/>
                <Route path="/recuperar" element={<RecSenha/>}/>
                <Route path="/compra" element={<Shopping/>}/>
                <Route path="/carrinho" element={<Carrinho/>}/>
                <Route path="/produto" element={<Produto/>}/>
                <Route path="/cadprodutos" element={<CadastroProduto/>}/>
                <Route path="/listprod" element={<ListaProdutos/>}/>
   
                
                

                
                
            </Routes>
        </BrowserRouter>
    )
}