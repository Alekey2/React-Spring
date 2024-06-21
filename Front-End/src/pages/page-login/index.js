import "./index.scss";
import React  from "react";
import Logo from "../../assets/images/logo.png"
export default function Login(){
    return(
        <section className="pag-login">
            <img src={Logo} alt="Logo SneakStyle"/>

            <div className="sec1">
            <h1>Login</h1>
                <div className="div-input">
                    <label for="Email"> E-mail: </label>    
                    <input type="text" name="Email" placeholder="Digite seu E-mail" required></input>

                    <label for="Senha"> Senha: </label>
                    <input type="password" name="Senha" placeholder="Digite sua Senha" required/>
                 </div>

                 <div className="botao">
                    <button> Acessar </button>
                 </div>
                
                <div className="rec">
                    <p><a href="recuperar">Esqueceu a senha ?</a></p>
                </div>

                <div className="cad">
                    <p>Não tem uma conta ainda ? <a href="Cadastro"> Cadastre-se</a></p>
                </div>
            </div>
        </section>
    )
};