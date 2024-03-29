package com.pfa.sudodental.service;


import com.pfa.sudodental.model.Decrire;
import com.pfa.sudodental.repository.DecrireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DecrireService extends AbstractService<Decrire,Long>{

    @Autowired
    private DecrireRepository decrireRepository;

    @Override
    protected JpaRepository<Decrire, Long> getRepository(){
        return decrireRepository;
    }

}
