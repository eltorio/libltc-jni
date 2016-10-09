/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.gareus.libltc;

public class samplebuffer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected samplebuffer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(samplebuffer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LTCJNI.delete_samplebuffer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public samplebuffer(int nelements) {
    this(LTCJNI.new_samplebuffer(nelements), true);
  }

  public short getitem(int index) {
    return LTCJNI.samplebuffer_getitem(swigCPtr, this, index);
  }

  public void setitem(int index, short value) {
    LTCJNI.samplebuffer_setitem(swigCPtr, this, index, value);
  }

  public SWIGTYPE_p_unsigned_char cast() {
    long cPtr = LTCJNI.samplebuffer_cast(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public static samplebuffer frompointer(SWIGTYPE_p_unsigned_char t) {
    long cPtr = LTCJNI.samplebuffer_frompointer(SWIGTYPE_p_unsigned_char.getCPtr(t));
    return (cPtr == 0) ? null : new samplebuffer(cPtr, false);
  }

}
