package com.newswebsite.repository;

import org.springframework.data.repository.CrudRepository;

import com.newswebsite.domain.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {

}
