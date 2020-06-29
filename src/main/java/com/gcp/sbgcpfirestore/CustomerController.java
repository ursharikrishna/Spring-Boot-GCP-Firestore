package com.gcp.sbgcpfirestore;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;

/**
 * Example controller demonstrating usage of Spring Data Repositories for Firestore.
 *
 * @author Daniel Zou
 */
@RestController
public class CustomerController {

	@Autowired
	private Firestore firestore;

	@RequestMapping(value = { "/readDocumentFromFireStore" })
	public void readDocumentToObject() throws ExecutionException, InterruptedException {
		ApiFuture<DocumentSnapshot> documentSnapshotApiFuture = this.firestore.collection("customer").document("gAJTDBnP4yVwhdG6uJ9L").get();
		Customer customer = documentSnapshotApiFuture.get().toObject(Customer.class);

		System.out.println(customer);
	
	}

}
