package com.pfa.sudodental.service;

import com.pfa.sudodental.model.Reglement;
import com.pfa.sudodental.repository.ReglementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ReglementService extends AbstractService<Reglement,Long>{

    @Autowired
    private ReglementRepository reglementRepository;

    @Override
    protected JpaRepository<Reglement, Long> getRepository(){
        return reglementRepository;

    }
}