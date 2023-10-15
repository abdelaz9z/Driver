package com.hyperone.data.repository

import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot
import com.hyperone.domain.repository.FirestoreRepository

class FirestoreRepositoryImpl(private val firestore: FirebaseFirestore) : FirestoreRepository {

    override suspend fun getDocuments(collection: String): Task<QuerySnapshot> =
        firestore.collection(collection).get()

    override suspend fun getDocuments(
        collection: String,
        documentId: String,
    ): Task<DocumentSnapshot> =
        firestore.collection(collection).document(documentId).get()

    override suspend fun getDocuments(
        collection: String,
        documentId: String,
        subCollection: String
    ): Task<QuerySnapshot> =
        firestore.collection(collection).document(documentId).collection(subCollection).get()


    override suspend fun addDocuments(collection: String, data: Any): Task<DocumentReference> {
        val collectionReference = firestore.collection(collection)
        return collectionReference.add(data)
    }

    override suspend fun updateDocument(
        collectionPath: String,
        documentId: String,
        updates: HashMap<String, Any>
    ): Task<Void> {
        val collectionReference =
            firestore.collection(collectionPath).document(documentId)

        return collectionReference.set(updates)
    }

    override suspend fun setDocument(
        collectionPath: String,
        documentId: String,
        updates: Any
    ): Task<Void> {
        val collectionReference =
            firestore.collection(collectionPath).document(documentId)

        return collectionReference.set(updates)
    }

    override suspend fun deleteDocument(collectionPath: String, documentId: String): Task<Void> {
        // Create a reference to the document
        val documentRef: DocumentReference =
            firestore.collection(collectionPath).document(documentId)

        // Delete the document
        return documentRef.delete()
    }

}