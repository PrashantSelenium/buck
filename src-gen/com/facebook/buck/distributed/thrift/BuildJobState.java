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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-11-07")
public class BuildJobState implements org.apache.thrift.TBase<BuildJobState, BuildJobState._Fields>, java.io.Serializable, Cloneable, Comparable<BuildJobState> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuildJobState");

  private static final org.apache.thrift.protocol.TField CELLS_FIELD_DESC = new org.apache.thrift.protocol.TField("cells", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField FILE_HASHES_FIELD_DESC = new org.apache.thrift.protocol.TField("fileHashes", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField TARGET_GRAPH_FIELD_DESC = new org.apache.thrift.protocol.TField("targetGraph", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuildJobStateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuildJobStateTupleSchemeFactory());
  }

  public Map<Integer,BuildJobStateCell> cells; // optional
  public List<BuildJobStateFileHashes> fileHashes; // optional
  public BuildJobStateTargetGraph targetGraph; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CELLS((short)1, "cells"),
    FILE_HASHES((short)2, "fileHashes"),
    TARGET_GRAPH((short)3, "targetGraph");

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
        case 1: // CELLS
          return CELLS;
        case 2: // FILE_HASHES
          return FILE_HASHES;
        case 3: // TARGET_GRAPH
          return TARGET_GRAPH;
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
  private static final _Fields optionals[] = {_Fields.CELLS,_Fields.FILE_HASHES,_Fields.TARGET_GRAPH};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CELLS, new org.apache.thrift.meta_data.FieldMetaData("cells", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuildJobStateCell.class))));
    tmpMap.put(_Fields.FILE_HASHES, new org.apache.thrift.meta_data.FieldMetaData("fileHashes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuildJobStateFileHashes.class))));
    tmpMap.put(_Fields.TARGET_GRAPH, new org.apache.thrift.meta_data.FieldMetaData("targetGraph", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuildJobStateTargetGraph.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuildJobState.class, metaDataMap);
  }

  public BuildJobState() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuildJobState(BuildJobState other) {
    if (other.isSetCells()) {
      Map<Integer,BuildJobStateCell> __this__cells = new HashMap<Integer,BuildJobStateCell>(other.cells.size());
      for (Map.Entry<Integer, BuildJobStateCell> other_element : other.cells.entrySet()) {

        Integer other_element_key = other_element.getKey();
        BuildJobStateCell other_element_value = other_element.getValue();

        Integer __this__cells_copy_key = other_element_key;

        BuildJobStateCell __this__cells_copy_value = new BuildJobStateCell(other_element_value);

        __this__cells.put(__this__cells_copy_key, __this__cells_copy_value);
      }
      this.cells = __this__cells;
    }
    if (other.isSetFileHashes()) {
      List<BuildJobStateFileHashes> __this__fileHashes = new ArrayList<BuildJobStateFileHashes>(other.fileHashes.size());
      for (BuildJobStateFileHashes other_element : other.fileHashes) {
        __this__fileHashes.add(new BuildJobStateFileHashes(other_element));
      }
      this.fileHashes = __this__fileHashes;
    }
    if (other.isSetTargetGraph()) {
      this.targetGraph = new BuildJobStateTargetGraph(other.targetGraph);
    }
  }

  public BuildJobState deepCopy() {
    return new BuildJobState(this);
  }

  @Override
  public void clear() {
    this.cells = null;
    this.fileHashes = null;
    this.targetGraph = null;
  }

  public int getCellsSize() {
    return (this.cells == null) ? 0 : this.cells.size();
  }

  public void putToCells(int key, BuildJobStateCell val) {
    if (this.cells == null) {
      this.cells = new HashMap<Integer,BuildJobStateCell>();
    }
    this.cells.put(key, val);
  }

  public Map<Integer,BuildJobStateCell> getCells() {
    return this.cells;
  }

  public BuildJobState setCells(Map<Integer,BuildJobStateCell> cells) {
    this.cells = cells;
    return this;
  }

  public void unsetCells() {
    this.cells = null;
  }

  /** Returns true if field cells is set (has been assigned a value) and false otherwise */
  public boolean isSetCells() {
    return this.cells != null;
  }

  public void setCellsIsSet(boolean value) {
    if (!value) {
      this.cells = null;
    }
  }

  public int getFileHashesSize() {
    return (this.fileHashes == null) ? 0 : this.fileHashes.size();
  }

  public java.util.Iterator<BuildJobStateFileHashes> getFileHashesIterator() {
    return (this.fileHashes == null) ? null : this.fileHashes.iterator();
  }

  public void addToFileHashes(BuildJobStateFileHashes elem) {
    if (this.fileHashes == null) {
      this.fileHashes = new ArrayList<BuildJobStateFileHashes>();
    }
    this.fileHashes.add(elem);
  }

  public List<BuildJobStateFileHashes> getFileHashes() {
    return this.fileHashes;
  }

  public BuildJobState setFileHashes(List<BuildJobStateFileHashes> fileHashes) {
    this.fileHashes = fileHashes;
    return this;
  }

  public void unsetFileHashes() {
    this.fileHashes = null;
  }

  /** Returns true if field fileHashes is set (has been assigned a value) and false otherwise */
  public boolean isSetFileHashes() {
    return this.fileHashes != null;
  }

  public void setFileHashesIsSet(boolean value) {
    if (!value) {
      this.fileHashes = null;
    }
  }

  public BuildJobStateTargetGraph getTargetGraph() {
    return this.targetGraph;
  }

  public BuildJobState setTargetGraph(BuildJobStateTargetGraph targetGraph) {
    this.targetGraph = targetGraph;
    return this;
  }

  public void unsetTargetGraph() {
    this.targetGraph = null;
  }

  /** Returns true if field targetGraph is set (has been assigned a value) and false otherwise */
  public boolean isSetTargetGraph() {
    return this.targetGraph != null;
  }

  public void setTargetGraphIsSet(boolean value) {
    if (!value) {
      this.targetGraph = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CELLS:
      if (value == null) {
        unsetCells();
      } else {
        setCells((Map<Integer,BuildJobStateCell>)value);
      }
      break;

    case FILE_HASHES:
      if (value == null) {
        unsetFileHashes();
      } else {
        setFileHashes((List<BuildJobStateFileHashes>)value);
      }
      break;

    case TARGET_GRAPH:
      if (value == null) {
        unsetTargetGraph();
      } else {
        setTargetGraph((BuildJobStateTargetGraph)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CELLS:
      return getCells();

    case FILE_HASHES:
      return getFileHashes();

    case TARGET_GRAPH:
      return getTargetGraph();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CELLS:
      return isSetCells();
    case FILE_HASHES:
      return isSetFileHashes();
    case TARGET_GRAPH:
      return isSetTargetGraph();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuildJobState)
      return this.equals((BuildJobState)that);
    return false;
  }

  public boolean equals(BuildJobState that) {
    if (that == null)
      return false;

    boolean this_present_cells = true && this.isSetCells();
    boolean that_present_cells = true && that.isSetCells();
    if (this_present_cells || that_present_cells) {
      if (!(this_present_cells && that_present_cells))
        return false;
      if (!this.cells.equals(that.cells))
        return false;
    }

    boolean this_present_fileHashes = true && this.isSetFileHashes();
    boolean that_present_fileHashes = true && that.isSetFileHashes();
    if (this_present_fileHashes || that_present_fileHashes) {
      if (!(this_present_fileHashes && that_present_fileHashes))
        return false;
      if (!this.fileHashes.equals(that.fileHashes))
        return false;
    }

    boolean this_present_targetGraph = true && this.isSetTargetGraph();
    boolean that_present_targetGraph = true && that.isSetTargetGraph();
    if (this_present_targetGraph || that_present_targetGraph) {
      if (!(this_present_targetGraph && that_present_targetGraph))
        return false;
      if (!this.targetGraph.equals(that.targetGraph))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_cells = true && (isSetCells());
    list.add(present_cells);
    if (present_cells)
      list.add(cells);

    boolean present_fileHashes = true && (isSetFileHashes());
    list.add(present_fileHashes);
    if (present_fileHashes)
      list.add(fileHashes);

    boolean present_targetGraph = true && (isSetTargetGraph());
    list.add(present_targetGraph);
    if (present_targetGraph)
      list.add(targetGraph);

    return list.hashCode();
  }

  @Override
  public int compareTo(BuildJobState other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCells()).compareTo(other.isSetCells());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCells()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cells, other.cells);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFileHashes()).compareTo(other.isSetFileHashes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFileHashes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fileHashes, other.fileHashes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTargetGraph()).compareTo(other.isSetTargetGraph());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargetGraph()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.targetGraph, other.targetGraph);
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
    StringBuilder sb = new StringBuilder("BuildJobState(");
    boolean first = true;

    if (isSetCells()) {
      sb.append("cells:");
      if (this.cells == null) {
        sb.append("null");
      } else {
        sb.append(this.cells);
      }
      first = false;
    }
    if (isSetFileHashes()) {
      if (!first) sb.append(", ");
      sb.append("fileHashes:");
      if (this.fileHashes == null) {
        sb.append("null");
      } else {
        sb.append(this.fileHashes);
      }
      first = false;
    }
    if (isSetTargetGraph()) {
      if (!first) sb.append(", ");
      sb.append("targetGraph:");
      if (this.targetGraph == null) {
        sb.append("null");
      } else {
        sb.append(this.targetGraph);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (targetGraph != null) {
      targetGraph.validate();
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

  private static class BuildJobStateStandardSchemeFactory implements SchemeFactory {
    public BuildJobStateStandardScheme getScheme() {
      return new BuildJobStateStandardScheme();
    }
  }

  private static class BuildJobStateStandardScheme extends StandardScheme<BuildJobState> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuildJobState struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CELLS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map60 = iprot.readMapBegin();
                struct.cells = new HashMap<Integer,BuildJobStateCell>(2*_map60.size);
                int _key61;
                BuildJobStateCell _val62;
                for (int _i63 = 0; _i63 < _map60.size; ++_i63)
                {
                  _key61 = iprot.readI32();
                  _val62 = new BuildJobStateCell();
                  _val62.read(iprot);
                  struct.cells.put(_key61, _val62);
                }
                iprot.readMapEnd();
              }
              struct.setCellsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FILE_HASHES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list64 = iprot.readListBegin();
                struct.fileHashes = new ArrayList<BuildJobStateFileHashes>(_list64.size);
                BuildJobStateFileHashes _elem65;
                for (int _i66 = 0; _i66 < _list64.size; ++_i66)
                {
                  _elem65 = new BuildJobStateFileHashes();
                  _elem65.read(iprot);
                  struct.fileHashes.add(_elem65);
                }
                iprot.readListEnd();
              }
              struct.setFileHashesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TARGET_GRAPH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.targetGraph = new BuildJobStateTargetGraph();
              struct.targetGraph.read(iprot);
              struct.setTargetGraphIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuildJobState struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cells != null) {
        if (struct.isSetCells()) {
          oprot.writeFieldBegin(CELLS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, struct.cells.size()));
            for (Map.Entry<Integer, BuildJobStateCell> _iter67 : struct.cells.entrySet())
            {
              oprot.writeI32(_iter67.getKey());
              _iter67.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.fileHashes != null) {
        if (struct.isSetFileHashes()) {
          oprot.writeFieldBegin(FILE_HASHES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.fileHashes.size()));
            for (BuildJobStateFileHashes _iter68 : struct.fileHashes)
            {
              _iter68.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.targetGraph != null) {
        if (struct.isSetTargetGraph()) {
          oprot.writeFieldBegin(TARGET_GRAPH_FIELD_DESC);
          struct.targetGraph.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuildJobStateTupleSchemeFactory implements SchemeFactory {
    public BuildJobStateTupleScheme getScheme() {
      return new BuildJobStateTupleScheme();
    }
  }

  private static class BuildJobStateTupleScheme extends TupleScheme<BuildJobState> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuildJobState struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCells()) {
        optionals.set(0);
      }
      if (struct.isSetFileHashes()) {
        optionals.set(1);
      }
      if (struct.isSetTargetGraph()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCells()) {
        {
          oprot.writeI32(struct.cells.size());
          for (Map.Entry<Integer, BuildJobStateCell> _iter69 : struct.cells.entrySet())
          {
            oprot.writeI32(_iter69.getKey());
            _iter69.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetFileHashes()) {
        {
          oprot.writeI32(struct.fileHashes.size());
          for (BuildJobStateFileHashes _iter70 : struct.fileHashes)
          {
            _iter70.write(oprot);
          }
        }
      }
      if (struct.isSetTargetGraph()) {
        struct.targetGraph.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuildJobState struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map71 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.cells = new HashMap<Integer,BuildJobStateCell>(2*_map71.size);
          int _key72;
          BuildJobStateCell _val73;
          for (int _i74 = 0; _i74 < _map71.size; ++_i74)
          {
            _key72 = iprot.readI32();
            _val73 = new BuildJobStateCell();
            _val73.read(iprot);
            struct.cells.put(_key72, _val73);
          }
        }
        struct.setCellsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list75 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.fileHashes = new ArrayList<BuildJobStateFileHashes>(_list75.size);
          BuildJobStateFileHashes _elem76;
          for (int _i77 = 0; _i77 < _list75.size; ++_i77)
          {
            _elem76 = new BuildJobStateFileHashes();
            _elem76.read(iprot);
            struct.fileHashes.add(_elem76);
          }
        }
        struct.setFileHashesIsSet(true);
      }
      if (incoming.get(2)) {
        struct.targetGraph = new BuildJobStateTargetGraph();
        struct.targetGraph.read(iprot);
        struct.setTargetGraphIsSet(true);
      }
    }
  }

}

