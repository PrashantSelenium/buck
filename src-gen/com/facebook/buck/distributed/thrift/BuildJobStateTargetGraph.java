/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-04-10")
public class BuildJobStateTargetGraph implements org.apache.thrift.TBase<BuildJobStateTargetGraph, BuildJobStateTargetGraph._Fields>, java.io.Serializable, Cloneable, Comparable<BuildJobStateTargetGraph> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuildJobStateTargetGraph");

  private static final org.apache.thrift.protocol.TField NODES_FIELD_DESC = new org.apache.thrift.protocol.TField("nodes", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuildJobStateTargetGraphStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuildJobStateTargetGraphTupleSchemeFactory());
  }

  public List<BuildJobStateTargetNode> nodes; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NODES((short)1, "nodes");

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
        case 1: // NODES
          return NODES;
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
  private static final _Fields optionals[] = {_Fields.NODES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NODES, new org.apache.thrift.meta_data.FieldMetaData("nodes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuildJobStateTargetNode.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuildJobStateTargetGraph.class, metaDataMap);
  }

  public BuildJobStateTargetGraph() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuildJobStateTargetGraph(BuildJobStateTargetGraph other) {
    if (other.isSetNodes()) {
      List<BuildJobStateTargetNode> __this__nodes = new ArrayList<BuildJobStateTargetNode>(other.nodes.size());
      for (BuildJobStateTargetNode other_element : other.nodes) {
        __this__nodes.add(new BuildJobStateTargetNode(other_element));
      }
      this.nodes = __this__nodes;
    }
  }

  public BuildJobStateTargetGraph deepCopy() {
    return new BuildJobStateTargetGraph(this);
  }

  @Override
  public void clear() {
    this.nodes = null;
  }

  public int getNodesSize() {
    return (this.nodes == null) ? 0 : this.nodes.size();
  }

  public java.util.Iterator<BuildJobStateTargetNode> getNodesIterator() {
    return (this.nodes == null) ? null : this.nodes.iterator();
  }

  public void addToNodes(BuildJobStateTargetNode elem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<BuildJobStateTargetNode>();
    }
    this.nodes.add(elem);
  }

  public List<BuildJobStateTargetNode> getNodes() {
    return this.nodes;
  }

  public BuildJobStateTargetGraph setNodes(List<BuildJobStateTargetNode> nodes) {
    this.nodes = nodes;
    return this;
  }

  public void unsetNodes() {
    this.nodes = null;
  }

  /** Returns true if field nodes is set (has been assigned a value) and false otherwise */
  public boolean isSetNodes() {
    return this.nodes != null;
  }

  public void setNodesIsSet(boolean value) {
    if (!value) {
      this.nodes = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NODES:
      if (value == null) {
        unsetNodes();
      } else {
        setNodes((List<BuildJobStateTargetNode>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NODES:
      return getNodes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NODES:
      return isSetNodes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuildJobStateTargetGraph)
      return this.equals((BuildJobStateTargetGraph)that);
    return false;
  }

  public boolean equals(BuildJobStateTargetGraph that) {
    if (that == null)
      return false;

    boolean this_present_nodes = true && this.isSetNodes();
    boolean that_present_nodes = true && that.isSetNodes();
    if (this_present_nodes || that_present_nodes) {
      if (!(this_present_nodes && that_present_nodes))
        return false;
      if (!this.nodes.equals(that.nodes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_nodes = true && (isSetNodes());
    list.add(present_nodes);
    if (present_nodes)
      list.add(nodes);

    return list.hashCode();
  }

  @Override
  public int compareTo(BuildJobStateTargetGraph other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNodes()).compareTo(other.isSetNodes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodes, other.nodes);
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
    StringBuilder sb = new StringBuilder("BuildJobStateTargetGraph(");
    boolean first = true;

    if (isSetNodes()) {
      sb.append("nodes:");
      if (this.nodes == null) {
        sb.append("null");
      } else {
        sb.append(this.nodes);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class BuildJobStateTargetGraphStandardSchemeFactory implements SchemeFactory {
    public BuildJobStateTargetGraphStandardScheme getScheme() {
      return new BuildJobStateTargetGraphStandardScheme();
    }
  }

  private static class BuildJobStateTargetGraphStandardScheme extends StandardScheme<BuildJobStateTargetGraph> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuildJobStateTargetGraph struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NODES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list62 = iprot.readListBegin();
                struct.nodes = new ArrayList<BuildJobStateTargetNode>(_list62.size);
                BuildJobStateTargetNode _elem63;
                for (int _i64 = 0; _i64 < _list62.size; ++_i64)
                {
                  _elem63 = new BuildJobStateTargetNode();
                  _elem63.read(iprot);
                  struct.nodes.add(_elem63);
                }
                iprot.readListEnd();
              }
              struct.setNodesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuildJobStateTargetGraph struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nodes != null) {
        if (struct.isSetNodes()) {
          oprot.writeFieldBegin(NODES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.nodes.size()));
            for (BuildJobStateTargetNode _iter65 : struct.nodes)
            {
              _iter65.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuildJobStateTargetGraphTupleSchemeFactory implements SchemeFactory {
    public BuildJobStateTargetGraphTupleScheme getScheme() {
      return new BuildJobStateTargetGraphTupleScheme();
    }
  }

  private static class BuildJobStateTargetGraphTupleScheme extends TupleScheme<BuildJobStateTargetGraph> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuildJobStateTargetGraph struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNodes()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetNodes()) {
        {
          oprot.writeI32(struct.nodes.size());
          for (BuildJobStateTargetNode _iter66 : struct.nodes)
          {
            _iter66.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuildJobStateTargetGraph struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list67 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.nodes = new ArrayList<BuildJobStateTargetNode>(_list67.size);
          BuildJobStateTargetNode _elem68;
          for (int _i69 = 0; _i69 < _list67.size; ++_i69)
          {
            _elem68 = new BuildJobStateTargetNode();
            _elem68.read(iprot);
            struct.nodes.add(_elem68);
          }
        }
        struct.setNodesIsSet(true);
      }
    }
  }

}

