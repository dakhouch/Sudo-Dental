package com.pfa.sudodental.service;


import com.pfa.sudodental.model.Rdv;
import com.pfa.sudodental.repository.RdvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class RdvService extends AbstractService<Rdv,Long>{

    @Autowired
    private RdvRepository rdvRepository;

    @Override
    protected JpaRepository<Rdv, Long> getRepository(){
        return rdvRepository;

    }
}
