/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database_info;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author 14011197
 */
@Stateless
public class SupplierRegionFacade extends AbstractFacade<SupplierRegion> {

    @PersistenceContext(unitName = "csd322_TylerBresnahan_Lab3PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SupplierRegionFacade() {
        super(SupplierRegion.class);
    }
    
}
