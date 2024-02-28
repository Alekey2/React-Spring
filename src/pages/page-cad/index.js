import "./index.scss";
import React from "react";
import Logo from '../../assets/images/logo.png'
export default function Cadastro() {
    return (
        <section className="pag-cad">
            <img src={Logo} alt="Logo SneakStyle" />

            <div className="sec1">
                <h1>Cadastro</h1>
                <div className="div-input">
                    
                    <input type="text" name="Nome" placeholder="Nome"></input>

                    
                    <input type="text" name="Email" placeholder="E-mail"></input>

                    
                    <input type="password" name="Senha" placeholder="Senha" />


                    
                    <input type="password" name="Senha" placeholder="Confirmar sua Senha" />
                    
                </div>

                    <div className="botao">
                        <button> Cadastrar </button>
                    </div>




            </div>
        </section>
    )
};