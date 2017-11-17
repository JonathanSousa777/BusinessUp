package com.bunisessup.model;

import java.io.Serializable;

public enum Maturidade implements Serializable {

    INEXISTENTE(0, "Inexistente", "O gerenciamento do processo de Definir um plano estratégico de TI que satisfaça ao requisito do negócio para a TI"
            + "de sustentar ou estender a estratégia de negócio e requisitos de governança e, ao mesmo tempo, ser transparente quanto aos"
            + "benefícios, custos e riscos."),
    INICIAL(1, "Inicial", "A necessidade de um planejamento estratégico de TI é conhecida pela Direção de TI. O planejamento de TI é realizado caso a caso"
            + ", em resposta a um requisito específico de negócio. O planejamento estratéico de TI é ocasionalmente discutidonas reuniões da Direção de TI."
            + " O alinhamento de requisitos de negócio, aplicações e tecnologia ocorre de forma reativa ao invés de seguir uma estratégia corporativa."
            + " A posição estratégica de risco é identificada informalmente projeto a projeto."),
    REPETIVEL(2, "Repetível", "O planejamento estratégico de TI é compartilhado com a Direção do Negócio conforme a necessidade. A atualização dos planos de TI"
            + " acontece em resposta aos pedidos da Direção. As decisões estratégicas são tomadas projeto a projeto, sem consistênciacom uma estratégia corporativa."
            + " Os riscos e beníficios do usuário nas principais decisões estratégicas são determinados de forma intuitiva."),
    DEFINIDO(3, "Definido", "Uma política define quando e como realizar um planejamento estratégico de TI. O planejamento estratégico de TI segue uma abodagem"
            + " estruturada, que é documentada e conhecida por todo o pessoal envolvido. O processodo planejamento de TI é razoavelmente discutido e assegura que "
            + "um planejamento adequado seja realizado. Entretando, a implementação do processo fica a critério de cada Direção e não há procedimentos para examinar o processo. "
            + "A estratégia geral de TI inclui uma definição consistente dos riscos que a organização aceita correr por ser inovadora ou por seguir tendências. As estragégias de recursos"
            + " financeiros, técnicos e humanos influenciam cada vez mais na aquisição de novos produtos e tecnologias. O planejamento estratégico de TI é discutido nas reuniões"
            + " de gerenciamento do negócio."),
    GERENCIADO(4, "Gerenciado", "O planejamento estratégico de TI é uma prática padrão cujas exceções são detectadas pela Direção. O planejamento estratégico de TI"
            + " é uma função da Direção com nível sênior de resoinsabilidade. A Direçãoé capaz demonitorar o processo de planejamento estratégico de TIm tomar decisões baseadas"
            + " nesse processo e medir sua efetividade. Os planejamentos de TI, de curto e longo prazo são cascateados de cima para baixo na organiazação, com atualização quando "
            + "necessário. A estratégia de TI e a estratégia global da organização estão se tornando gradativamente mais coordenadas por abordar processos de negócio, capacidades de "
            + "valor agregado e alavancar o uso de aplicativos e tecnologias na reengenharia dos processos de negócios. Há um processo bem definido para determinar o uso dos recursos"
            + " internos e externos no desenvolvimento de sistema e operações."),
    OTIMIZADO(5, "Otimizado", "O planejamento estratégico de TI é um processo documentado e dinâmico, sempre considerado no estabelecimento dos dos objetivos de negócio,"
            + " e resulta em valor de negócio identificável através dos investimentos em TI. As considerações de risco e o valor agregado são continuamente atualizados no processo"
            + " de planejamento estratégico de TI. Planos realísticos de TI de longo prazosão desenvolvidos e constantemente atualizados para refletir mudanças na tecnologia e no "
            + "desenvolvimento relativos ao negocio. Comparações com normas confiáveis e bem conhecidas do mercado são realizadas e integradas ao processo de formulação "
            + " de estratégias(benchmarking). O planejamento estratégico inclui uma análise de como as novas tecnologias podem criar novas capacidades de negócio e melhorar a "
            + "vantagem competitiva da organização.");

    private int codigo;
    private String nome;
    private String descricao;

    private Maturidade(int codigo, String descricao, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
    }

}
