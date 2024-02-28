import "./index.scss";
import { Link } from 'react-router-dom';
import React  from "react";
export default function Home(){
    return(
        <section className="pag-home">
            <div className="sec1">
                <h1>Ladding page</h1>
                <Link to='/cadastro'>Cadastro</Link>
                
                <Link to='/login'>Login</Link>
               
                <Link to='/recuperar'>Recuperar Senha</Link>
                
                <Link to='/compra'>Shopping</Link>
               
                <Link to='/listprod'>Lista Produtos</Link>
               
                <Link to='/carrinho'>Carrinho</Link>
                
                <Link to='/produto'>Produto</Link>
                
                <Link to='/cadprodutos'>Cadastro de Produto</Link>                
            </div>
        </section>
    )
};