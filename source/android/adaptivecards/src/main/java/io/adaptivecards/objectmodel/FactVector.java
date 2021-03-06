/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class FactVector extends java.util.AbstractList<Fact> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FactVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FactVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_FactVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FactVector(Fact[] initialElements) {
    this();
    for (Fact element : initialElements) {
      add(element);
    }
  }

  public FactVector(Iterable<Fact> initialElements) {
    this();
    for (Fact element : initialElements) {
      add(element);
    }
  }

  public Fact get(int index) {
    return doGet(index);
  }

  public Fact set(int index, Fact e) {
    return doSet(index, e);
  }

  public boolean add(Fact e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, Fact e) {
    modCount++;
    doAdd(index, e);
  }

  public Fact remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public FactVector() {
    this(AdaptiveCardObjectModelJNI.new_FactVector__SWIG_0(), true);
  }

  public FactVector(FactVector other) {
    this(AdaptiveCardObjectModelJNI.new_FactVector__SWIG_1(FactVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return AdaptiveCardObjectModelJNI.FactVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    AdaptiveCardObjectModelJNI.FactVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return AdaptiveCardObjectModelJNI.FactVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    AdaptiveCardObjectModelJNI.FactVector_clear(swigCPtr, this);
  }

  public FactVector(int count, Fact value) {
    this(AdaptiveCardObjectModelJNI.new_FactVector__SWIG_2(count, Fact.getCPtr(value), value), true);
  }

  private int doSize() {
    return AdaptiveCardObjectModelJNI.FactVector_doSize(swigCPtr, this);
  }

  private void doAdd(Fact x) {
    AdaptiveCardObjectModelJNI.FactVector_doAdd__SWIG_0(swigCPtr, this, Fact.getCPtr(x), x);
  }

  private void doAdd(int index, Fact x) {
    AdaptiveCardObjectModelJNI.FactVector_doAdd__SWIG_1(swigCPtr, this, index, Fact.getCPtr(x), x);
  }

  private Fact doRemove(int index) {
    long cPtr = AdaptiveCardObjectModelJNI.FactVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Fact(cPtr, true);
  }

  private Fact doGet(int index) {
    long cPtr = AdaptiveCardObjectModelJNI.FactVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Fact(cPtr, true);
  }

  private Fact doSet(int index, Fact val) {
    long cPtr = AdaptiveCardObjectModelJNI.FactVector_doSet(swigCPtr, this, index, Fact.getCPtr(val), val);
    return (cPtr == 0) ? null : new Fact(cPtr, true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    AdaptiveCardObjectModelJNI.FactVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
