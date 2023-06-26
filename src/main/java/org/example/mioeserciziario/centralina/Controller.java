package org.example.mioeserciziario.centralina;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Function> functionList;

    public Controller() {
        this.functionList= new ArrayList<>();
    }

    public Function addFunction (String nomeFunction){
        Function newFunction = new Function(nomeFunction);
        for (Function f : functionList){
            if(f.equals(newFunction)){
                System.out.println("Errore, funzionalità già inserita nel controller!");
                return null;
            }
        }
        functionList.add(newFunction);
        return newFunction;
    }

    public void printOn(){
        boolean flag;
        List<Function> incFuncList;
        if(!functionList.isEmpty()) {
            flag=true;
            for (Function x : functionList) {
                incFuncList = x.getIncompFunctionList();
                for (Function y : incFuncList) {
                    for (Function z : functionList) {
                        if (z.equals(y)) {
                            flag = false;
                            break;
                        }
                    }
                    if (!flag) {
                        break;
                    }
                }
                if (flag) {
                    System.out.println(x.getNome());
                }
            }
        }else{
            System.out.println("Errore, il controller non ha funzionalità");
        }

    }


    public static class Function {
        private String nome;
        private boolean acceso;
        private List<Function> incompFunctionList;

        public Function(String nome) {
            this.nome = nome;
            this.incompFunctionList= new ArrayList<>();
        }

        public void turnOn(){
            this.acceso=true;
        }


        public void turnOff(){
            this.acceso=false;
        }

        public void setIncompatible(Function otherFunction){

            for(Function f : incompFunctionList){
                if(f.equals(otherFunction)){
                    System.out.println ("Funzionalità già inserita!");
                    return;
                }
            }

            incompFunctionList.add(otherFunction);
        }

        @Override
        public boolean equals(Object obj){
            Function otherFunction = (Function) obj;
            if     (otherFunction.getNome().equals(this.nome)){
                return true;
            }

            return false;
        }

        public String getNome() {
            return nome;
        }

        public boolean isAcceso() {
            return acceso;
        }

        public List<Function> getIncompFunctionList() {
            return incompFunctionList;
        }
    }

}
