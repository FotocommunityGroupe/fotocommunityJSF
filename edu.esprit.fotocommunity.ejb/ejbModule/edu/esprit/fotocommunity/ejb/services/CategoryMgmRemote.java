package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.fotocommunity.ejb.entities.Category;

@Remote
public interface CategoryMgmRemote {
public void addCat(Category c);
public void updateCat(Category c);
public void deleteCat(Category c);
public Category find(int id);
public List<Category> findall();
}
