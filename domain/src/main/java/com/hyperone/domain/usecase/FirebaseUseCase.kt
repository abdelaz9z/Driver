package com.hyperone.domain.usecase

import com.hyperone.domain.repository.FirestoreRepository

class FirebaseUseCase(private val firestoreRepository: FirestoreRepository) {

    suspend fun addDocuments(collection: String, data: Any) =
        firestoreRepository.addDocuments(collection, data)

    suspend fun deleteDocument(
        collectionPath: String,
        documentId: String
    ) = firestoreRepository.deleteDocument(collectionPath, documentId)

    suspend fun getDocuments(collection: String) = firestoreRepository.getDocuments(collection)

    suspend fun getDocuments(collection: String, documentId: String) =
        firestoreRepository.getDocuments(collection, documentId)

    suspend fun getDocuments(collection: String, documentId: String, subCollection: String) =
        firestoreRepository.getDocuments(collection, documentId, subCollection)

    suspend fun updateDocument(
        collectionPath: String,
        documentId: String,
        updates: Any
    ) = firestoreRepository.setDocument(collectionPath, documentId, updates)

    suspend fun updateDocument(
        collectionPath: String,
        documentId: String,
        updates: HashMap<String, Any>
    ) = firestoreRepository.updateDocument(collectionPath, documentId, updates)
}