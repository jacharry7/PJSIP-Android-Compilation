/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class AccountRegConfig extends PersistentObject {
  private long swigCPtr;

  protected AccountRegConfig(long cPtr, boolean cMemoryOwn) {
    super(pjsua2JNI.AccountRegConfig_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AccountRegConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_AccountRegConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setRegistrarUri(String value) {
    pjsua2JNI.AccountRegConfig_registrarUri_set(swigCPtr, this, value);
  }

  public String getRegistrarUri() {
    return pjsua2JNI.AccountRegConfig_registrarUri_get(swigCPtr, this);
  }

  public void setRegisterOnAdd(boolean value) {
    pjsua2JNI.AccountRegConfig_registerOnAdd_set(swigCPtr, this, value);
  }

  public boolean getRegisterOnAdd() {
    return pjsua2JNI.AccountRegConfig_registerOnAdd_get(swigCPtr, this);
  }

  public void setHeaders(SipHeaderVector value) {
    pjsua2JNI.AccountRegConfig_headers_set(swigCPtr, this, SipHeaderVector.getCPtr(value), value);
  }

  public SipHeaderVector getHeaders() {
    long cPtr = pjsua2JNI.AccountRegConfig_headers_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SipHeaderVector(cPtr, false);
  }

  public void setTimeoutSec(long value) {
    pjsua2JNI.AccountRegConfig_timeoutSec_set(swigCPtr, this, value);
  }

  public long getTimeoutSec() {
    return pjsua2JNI.AccountRegConfig_timeoutSec_get(swigCPtr, this);
  }

  public void setRetryIntervalSec(long value) {
    pjsua2JNI.AccountRegConfig_retryIntervalSec_set(swigCPtr, this, value);
  }

  public long getRetryIntervalSec() {
    return pjsua2JNI.AccountRegConfig_retryIntervalSec_get(swigCPtr, this);
  }

  public void setFirstRetryIntervalSec(long value) {
    pjsua2JNI.AccountRegConfig_firstRetryIntervalSec_set(swigCPtr, this, value);
  }

  public long getFirstRetryIntervalSec() {
    return pjsua2JNI.AccountRegConfig_firstRetryIntervalSec_get(swigCPtr, this);
  }

  public void setDelayBeforeRefreshSec(long value) {
    pjsua2JNI.AccountRegConfig_delayBeforeRefreshSec_set(swigCPtr, this, value);
  }

  public long getDelayBeforeRefreshSec() {
    return pjsua2JNI.AccountRegConfig_delayBeforeRefreshSec_get(swigCPtr, this);
  }

  public void setDropCallsOnFail(boolean value) {
    pjsua2JNI.AccountRegConfig_dropCallsOnFail_set(swigCPtr, this, value);
  }

  public boolean getDropCallsOnFail() {
    return pjsua2JNI.AccountRegConfig_dropCallsOnFail_get(swigCPtr, this);
  }

  public void setUnregWaitSec(long value) {
    pjsua2JNI.AccountRegConfig_unregWaitSec_set(swigCPtr, this, value);
  }

  public long getUnregWaitSec() {
    return pjsua2JNI.AccountRegConfig_unregWaitSec_get(swigCPtr, this);
  }

  public void setProxyUse(long value) {
    pjsua2JNI.AccountRegConfig_proxyUse_set(swigCPtr, this, value);
  }

  public long getProxyUse() {
    return pjsua2JNI.AccountRegConfig_proxyUse_get(swigCPtr, this);
  }

  public void readObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.AccountRegConfig_readObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

  public void writeObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.AccountRegConfig_writeObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

  public AccountRegConfig() {
    this(pjsua2JNI.new_AccountRegConfig(), true);
  }

}
