/**
 * AmazonS3_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jets3t.service.impl.soap.axis._2006_03_01;

public interface AmazonS3_PortType extends java.rmi.Remote {
    public org.jets3t.service.impl.soap.axis._2006_03_01.CreateBucketResult createBucket(java.lang.String bucket, org.jets3t.service.impl.soap.axis._2006_03_01.Grant[] accessControlList, java.lang.String AWSAccessKeyId, java.util.Calendar timestamp, java.lang.String signature) throws java.rmi.RemoteException;
    public org.jets3t.service.impl.soap.axis._2006_03_01.Status deleteBucket(java.lang.String bucket, java.lang.String AWSAccessKeyId, java.util.Calendar timestamp, java.lang.String signature, java.lang.String credential) throws java.rmi.RemoteException;
    public org.jets3t.service.impl.soap.axis._2006_03_01.AccessControlPolicy getObjectAccessControlPolicy(java.lang.String bucket, java.lang.String key, java.lang.String AWSAccessKeyId, java.util.Calendar timestamp, java.lang.String signature, java.lang.String credential) throws java.rmi.RemoteException;
    public org.jets3t.service.impl.soap.axis._2006_03_01.AccessControlPolicy getBucketAccessControlPolicy(java.lang.String bucket, java.lang.String AWSAccessKeyId, java.util.Calendar timestamp, java.lang.String signature, java.lang.String credential) throws java.rmi.RemoteException;
    public void setObjectAccessControlPolicy(java.lang.String bucket, java.lang.String key, org.jets3t.service.impl.soap.axis._2006_03_01.Grant[] accessControlList, java.lang.String AWSAccessKeyId, java.util.Calendar timestamp, java.lang.String signature, java.lang.String credential) throws java.rmi.RemoteException;
    public void setBucketAccessControlPolicy(java.lang.String bucket, org.jets3t.service.impl.soap.axis._2006_03_01.Grant[] accessControlList, java.lang.String AWSAccessKeyId, java.util.Calendar timestamp, java.lang.String signature, java.lang.String credential) throws java.rmi.RemoteException;
    public org.jets3t.service.impl.soap.axis._2006_03_01.GetObjectResult getObject(java.lang.String bucket, java.lang.String key, boolean getMetadata, boolean getData, boolean inlineData, java.lang.String AWSAccessKeyId, java.util.Calendar timestamp, java.lang.String signature, java.lang.String credential) throws java.rmi.RemoteException;
    public org.jets3t.service.impl.soap.axis._2006_03_01.GetObjectResult getObjectExtended(java.lang.String bucket, java.lang.String key, boolean getMetadata, boolean getData, boolean inlineData, java.lang.Long byteRangeStart, java.lang.Long byteRangeEnd, java.util.Calendar ifModifiedSince, java.util.Calendar ifUnmodifiedSince, java.lang.String[] ifMatch, java.lang.String[] ifNoneMatch, java.lang.Boolean returnCompleteObjectOnConditionFailure, java.lang.String AWSAccessKeyId, java.util.Calendar timestamp, java.lang.String signature, java.lang.String credential) throws java.rmi.RemoteException;
    public org.jets3t.service.impl.soap.axis._2006_03_01.PutObjectResult putObject(java.lang.String bucket, java.lang.String key, org.jets3t.service.impl.soap.axis._2006_03_01.MetadataEntry[] metadata, long contentLength, org.jets3t.service.impl.soap.axis._2006_03_01.Grant[] accessControlList, org.jets3t.service.impl.soap.axis._2006_03_01.StorageClass storageClass, java.lang.String AWSAccessKeyId, java.util.Calendar timestamp, java.lang.String signature, java.lang.String credential) throws java.rmi.RemoteException;
    public org.jets3t.service.impl.soap.axis._2006_03_01.PutObjectResult putObjectInline(java.lang.String bucket, java.lang.String key, org.jets3t.service.impl.soap.axis._2006_03_01.MetadataEntry[] metadata, byte[] data, long contentLength, org.jets3t.service.impl.soap.axis._2006_03_01.Grant[] accessControlList, org.jets3t.service.impl.soap.axis._2006_03_01.StorageClass storageClass, java.lang.String AWSAccessKeyId, java.util.Calendar timestamp, java.lang.String signature, java.lang.String credential) throws java.rmi.RemoteException;
    public org.jets3t.service.impl.soap.axis._2006_03_01.Status deleteObject(java.lang.String bucket, java.lang.String key, java.lang.String AWSAccessKeyId, java.util.Calendar timestamp, java.lang.String signature, java.lang.String credential) throws java.rmi.RemoteException;
    public org.jets3t.service.impl.soap.axis._2006_03_01.ListBucketResult listBucket(java.lang.String bucket, java.lang.String prefix, java.lang.String marker, java.lang.Integer maxKeys, java.lang.String delimiter, java.lang.String AWSAccessKeyId, java.util.Calendar timestamp, java.lang.String signature, java.lang.String credential) throws java.rmi.RemoteException;
    public org.jets3t.service.impl.soap.axis._2006_03_01.ListAllMyBucketsResult listAllMyBuckets(java.lang.String AWSAccessKeyId, java.util.Calendar timestamp, java.lang.String signature) throws java.rmi.RemoteException;
    public org.jets3t.service.impl.soap.axis._2006_03_01.BucketLoggingStatus getBucketLoggingStatus(java.lang.String bucket, java.lang.String AWSAccessKeyId, java.util.Calendar timestamp, java.lang.String signature, java.lang.String credential) throws java.rmi.RemoteException;
    public void setBucketLoggingStatus(java.lang.String bucket, java.lang.String AWSAccessKeyId, java.util.Calendar timestamp, java.lang.String signature, java.lang.String credential, org.jets3t.service.impl.soap.axis._2006_03_01.BucketLoggingStatus bucketLoggingStatus) throws java.rmi.RemoteException;
    public org.jets3t.service.impl.soap.axis._2006_03_01.CopyObjectResult copyObject(java.lang.String sourceBucket, java.lang.String sourceKey, java.lang.String destinationBucket, java.lang.String destinationKey, org.jets3t.service.impl.soap.axis._2006_03_01.MetadataDirective metadataDirective, org.jets3t.service.impl.soap.axis._2006_03_01.MetadataEntry[] metadata, org.jets3t.service.impl.soap.axis._2006_03_01.Grant[] accessControlList, java.util.Calendar copySourceIfModifiedSince, java.util.Calendar copySourceIfUnmodifiedSince, java.lang.String[] copySourceIfMatch, java.lang.String[] copySourceIfNoneMatch, org.jets3t.service.impl.soap.axis._2006_03_01.StorageClass storageClass, java.lang.String AWSAccessKeyId, java.util.Calendar timestamp, java.lang.String signature, java.lang.String credential) throws java.rmi.RemoteException;
}
