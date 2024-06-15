#include<iostream> 

int main(){
    std::string user;
    int opcao, pin, confirm, cont = 0;
    double renda, pSaude, alim, despFix, lazer, escola, sobra, porc;

    while(true){
        
            std::cout << std::endl;
            std::cout << "Escolha uma opção" << std::endl;;
            std::cout << "1. Cadastro "<< std::endl;
            std::cout << "2. Login "<< std::endl;
            std::cout << "3. Gerencie seus gastos mensais "<< std::endl;
            std::cout << "4. Gerenciador de sonhos "<< std::endl;
            std::cout << "5. Ensino financeiro "<< std::endl;
            std::cout << "6. Sair "<< std::endl;

            std::cin >> opcao;
            if (opcao == 6){break;} 
    }
}

