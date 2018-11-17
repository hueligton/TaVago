/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manager;

import org.hibernate.HibernateException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hueli
 */
public class HotelManagerTest {

    public HotelManagerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of cadastrarCategoria method, of class HotelManager.
     */
    @Test
    public void testCadastrarCategoria() {
        try {
            System.out.println("cadastrarCategoria");
            String descricao = "teste";
            HotelManager instance = new HotelManager();
            instance.cadastrarCategoria(descricao);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
