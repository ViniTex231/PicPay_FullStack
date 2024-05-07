package com.picpaysimplificado.picpay.repositories;
import com.picpaysimplificado.picpay.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}