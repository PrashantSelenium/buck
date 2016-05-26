/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.artifact_cache.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-05-25")
public class BuckCacheStoreRequest implements org.apache.thrift.TBase<BuckCacheStoreRequest, BuckCacheStoreRequest._Fields>, java.io.Serializable, Cloneable, Comparable<BuckCacheStoreRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuckCacheStoreRequest");

  private static final org.apache.thrift.protocol.TField METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PAYLOAD_FIELD_DESC = new org.apache.thrift.protocol.TField("payload", org.apache.thrift.protocol.TType.STRING, (short)100);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuckCacheStoreRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuckCacheStoreRequestTupleSchemeFactory());
  }

  public ArtifactMetadata metadata; // optional
  public ByteBuffer payload; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    METADATA((short)1, "metadata"),
    PAYLOAD((short)100, "payload");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // METADATA
          return METADATA;
        case 100: // PAYLOAD
          return PAYLOAD;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.METADATA,_Fields.PAYLOAD};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.METADATA, new org.apache.thrift.meta_data.FieldMetaData("metadata", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ArtifactMetadata.class)));
    tmpMap.put(_Fields.PAYLOAD, new org.apache.thrift.meta_data.FieldMetaData("payload", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuckCacheStoreRequest.class, metaDataMap);
  }

  public BuckCacheStoreRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuckCacheStoreRequest(BuckCacheStoreRequest other) {
    if (other.isSetMetadata()) {
      this.metadata = new ArtifactMetadata(other.metadata);
    }
    if (other.isSetPayload()) {
      this.payload = org.apache.thrift.TBaseHelper.copyBinary(other.payload);
    }
  }

  public BuckCacheStoreRequest deepCopy() {
    return new BuckCacheStoreRequest(this);
  }

  @Override
  public void clear() {
    this.metadata = null;
    this.payload = null;
  }

  public ArtifactMetadata getMetadata() {
    return this.metadata;
  }

  public BuckCacheStoreRequest setMetadata(ArtifactMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  public void unsetMetadata() {
    this.metadata = null;
  }

  /** Returns true if field metadata is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadata() {
    return this.metadata != null;
  }

  public void setMetadataIsSet(boolean value) {
    if (!value) {
      this.metadata = null;
    }
  }

  public byte[] getPayload() {
    setPayload(org.apache.thrift.TBaseHelper.rightSize(payload));
    return payload == null ? null : payload.array();
  }

  public ByteBuffer bufferForPayload() {
    return org.apache.thrift.TBaseHelper.copyBinary(payload);
  }

  public BuckCacheStoreRequest setPayload(byte[] payload) {
    this.payload = payload == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(payload, payload.length));
    return this;
  }

  public BuckCacheStoreRequest setPayload(ByteBuffer payload) {
    this.payload = org.apache.thrift.TBaseHelper.copyBinary(payload);
    return this;
  }

  public void unsetPayload() {
    this.payload = null;
  }

  /** Returns true if field payload is set (has been assigned a value) and false otherwise */
  public boolean isSetPayload() {
    return this.payload != null;
  }

  public void setPayloadIsSet(boolean value) {
    if (!value) {
      this.payload = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case METADATA:
      if (value == null) {
        unsetMetadata();
      } else {
        setMetadata((ArtifactMetadata)value);
      }
      break;

    case PAYLOAD:
      if (value == null) {
        unsetPayload();
      } else {
        setPayload((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case METADATA:
      return getMetadata();

    case PAYLOAD:
      return getPayload();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case METADATA:
      return isSetMetadata();
    case PAYLOAD:
      return isSetPayload();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuckCacheStoreRequest)
      return this.equals((BuckCacheStoreRequest)that);
    return false;
  }

  public boolean equals(BuckCacheStoreRequest that) {
    if (that == null)
      return false;

    boolean this_present_metadata = true && this.isSetMetadata();
    boolean that_present_metadata = true && that.isSetMetadata();
    if (this_present_metadata || that_present_metadata) {
      if (!(this_present_metadata && that_present_metadata))
        return false;
      if (!this.metadata.equals(that.metadata))
        return false;
    }

    boolean this_present_payload = true && this.isSetPayload();
    boolean that_present_payload = true && that.isSetPayload();
    if (this_present_payload || that_present_payload) {
      if (!(this_present_payload && that_present_payload))
        return false;
      if (!this.payload.equals(that.payload))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_metadata = true && (isSetMetadata());
    list.add(present_metadata);
    if (present_metadata)
      list.add(metadata);

    boolean present_payload = true && (isSetPayload());
    list.add(present_payload);
    if (present_payload)
      list.add(payload);

    return list.hashCode();
  }

  @Override
  public int compareTo(BuckCacheStoreRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMetadata()).compareTo(other.isSetMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadata, other.metadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPayload()).compareTo(other.isSetPayload());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPayload()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.payload, other.payload);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BuckCacheStoreRequest(");
    boolean first = true;

    if (isSetMetadata()) {
      sb.append("metadata:");
      if (this.metadata == null) {
        sb.append("null");
      } else {
        sb.append(this.metadata);
      }
      first = false;
    }
    if (isSetPayload()) {
      if (!first) sb.append(", ");
      sb.append("payload:");
      if (this.payload == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.payload, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (metadata != null) {
      metadata.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BuckCacheStoreRequestStandardSchemeFactory implements SchemeFactory {
    public BuckCacheStoreRequestStandardScheme getScheme() {
      return new BuckCacheStoreRequestStandardScheme();
    }
  }

  private static class BuckCacheStoreRequestStandardScheme extends StandardScheme<BuckCacheStoreRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuckCacheStoreRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.metadata = new ArtifactMetadata();
              struct.metadata.read(iprot);
              struct.setMetadataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 100: // PAYLOAD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.payload = iprot.readBinary();
              struct.setPayloadIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuckCacheStoreRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metadata != null) {
        if (struct.isSetMetadata()) {
          oprot.writeFieldBegin(METADATA_FIELD_DESC);
          struct.metadata.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.payload != null) {
        if (struct.isSetPayload()) {
          oprot.writeFieldBegin(PAYLOAD_FIELD_DESC);
          oprot.writeBinary(struct.payload);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuckCacheStoreRequestTupleSchemeFactory implements SchemeFactory {
    public BuckCacheStoreRequestTupleScheme getScheme() {
      return new BuckCacheStoreRequestTupleScheme();
    }
  }

  private static class BuckCacheStoreRequestTupleScheme extends TupleScheme<BuckCacheStoreRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuckCacheStoreRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMetadata()) {
        optionals.set(0);
      }
      if (struct.isSetPayload()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMetadata()) {
        struct.metadata.write(oprot);
      }
      if (struct.isSetPayload()) {
        oprot.writeBinary(struct.payload);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuckCacheStoreRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.metadata = new ArtifactMetadata();
        struct.metadata.read(iprot);
        struct.setMetadataIsSet(true);
      }
      if (incoming.get(1)) {
        struct.payload = iprot.readBinary();
        struct.setPayloadIsSet(true);
      }
    }
  }

}

