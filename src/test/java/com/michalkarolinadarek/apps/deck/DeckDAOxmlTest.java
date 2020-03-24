package com.michalkarolinadarek.apps.deck;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

import static org.junit.Assert.*;

public class DeckDAOxmlTest {

    @org.junit.Test
    public void writeXmlFile() {
        DeckDAOxml dao;
        try {
            dao = new DeckDAOxml("src/main/resources/virus.xml");
            dao.writeXmlFile(dao.getDeck());
        } catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
            e.printStackTrace();
        }
    }
}