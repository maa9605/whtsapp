package X;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0fL */
/* loaded from: classes.dex */
public class C10130fL implements Externalizable {
    public static final long serialVersionUID = 1;
    public boolean hasCountryCode;
    public boolean hasEmergency;
    public boolean hasFixedLine;
    public boolean hasGeneralDesc;
    public boolean hasId;
    public boolean hasInternationalPrefix;
    public boolean hasLeadingDigits;
    public boolean hasLeadingZeroPossible;
    public boolean hasMainCountryForCode;
    public boolean hasMobile;
    public boolean hasNationalPrefix;
    public boolean hasNationalPrefixForParsing;
    public boolean hasNationalPrefixTransformRule;
    public boolean hasNoInternationalDialling;
    public boolean hasPager;
    public boolean hasPersonalNumber;
    public boolean hasPreferredExtnPrefix;
    public boolean hasPreferredInternationalPrefix;
    public boolean hasPremiumRate;
    public boolean hasSameMobileAndFixedLinePattern;
    public boolean hasSharedCost;
    public boolean hasTollFree;
    public boolean hasUan;
    public boolean hasVoicemail;
    public boolean hasVoip;
    public C10150fN generalDesc_ = null;
    public C10150fN fixedLine_ = null;
    public C10150fN mobile_ = null;
    public C10150fN tollFree_ = null;
    public C10150fN premiumRate_ = null;
    public C10150fN sharedCost_ = null;
    public C10150fN personalNumber_ = null;
    public C10150fN voip_ = null;
    public C10150fN pager_ = null;
    public C10150fN uan_ = null;
    public C10150fN voicemail_ = null;
    public C10150fN emergency_ = null;
    public C10150fN noInternationalDialling_ = null;
    public String id_ = "";
    public int countryCode_ = 0;
    public String internationalPrefix_ = "";
    public String preferredInternationalPrefix_ = "";
    public String nationalPrefix_ = "";
    public String preferredExtnPrefix_ = "";
    public String nationalPrefixForParsing_ = "";
    public String nationalPrefixTransformRule_ = "";
    public boolean sameMobileAndFixedLinePattern_ = false;
    public List numberFormat_ = new ArrayList();
    public List intlNumberFormat_ = new ArrayList();
    public boolean mainCountryForCode_ = false;
    public String leadingDigits_ = "";
    public boolean leadingZeroPossible_ = false;

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            C10150fN c10150fN = new C10150fN();
            c10150fN.readExternal(objectInput);
            this.hasGeneralDesc = true;
            this.generalDesc_ = c10150fN;
        }
        if (objectInput.readBoolean()) {
            C10150fN c10150fN2 = new C10150fN();
            c10150fN2.readExternal(objectInput);
            this.hasFixedLine = true;
            this.fixedLine_ = c10150fN2;
        }
        if (objectInput.readBoolean()) {
            C10150fN c10150fN3 = new C10150fN();
            c10150fN3.readExternal(objectInput);
            this.hasMobile = true;
            this.mobile_ = c10150fN3;
        }
        if (objectInput.readBoolean()) {
            C10150fN c10150fN4 = new C10150fN();
            c10150fN4.readExternal(objectInput);
            this.hasTollFree = true;
            this.tollFree_ = c10150fN4;
        }
        if (objectInput.readBoolean()) {
            C10150fN c10150fN5 = new C10150fN();
            c10150fN5.readExternal(objectInput);
            this.hasPremiumRate = true;
            this.premiumRate_ = c10150fN5;
        }
        if (objectInput.readBoolean()) {
            C10150fN c10150fN6 = new C10150fN();
            c10150fN6.readExternal(objectInput);
            this.hasSharedCost = true;
            this.sharedCost_ = c10150fN6;
        }
        if (objectInput.readBoolean()) {
            C10150fN c10150fN7 = new C10150fN();
            c10150fN7.readExternal(objectInput);
            this.hasPersonalNumber = true;
            this.personalNumber_ = c10150fN7;
        }
        if (objectInput.readBoolean()) {
            C10150fN c10150fN8 = new C10150fN();
            c10150fN8.readExternal(objectInput);
            this.hasVoip = true;
            this.voip_ = c10150fN8;
        }
        if (objectInput.readBoolean()) {
            C10150fN c10150fN9 = new C10150fN();
            c10150fN9.readExternal(objectInput);
            this.hasPager = true;
            this.pager_ = c10150fN9;
        }
        if (objectInput.readBoolean()) {
            C10150fN c10150fN10 = new C10150fN();
            c10150fN10.readExternal(objectInput);
            this.hasUan = true;
            this.uan_ = c10150fN10;
        }
        if (objectInput.readBoolean()) {
            C10150fN c10150fN11 = new C10150fN();
            c10150fN11.readExternal(objectInput);
            this.hasVoicemail = true;
            this.voicemail_ = c10150fN11;
        }
        if (objectInput.readBoolean()) {
            C10150fN c10150fN12 = new C10150fN();
            c10150fN12.readExternal(objectInput);
            this.hasEmergency = true;
            this.emergency_ = c10150fN12;
        }
        if (objectInput.readBoolean()) {
            C10150fN c10150fN13 = new C10150fN();
            c10150fN13.readExternal(objectInput);
            this.hasNoInternationalDialling = true;
            this.noInternationalDialling_ = c10150fN13;
        }
        String readUTF = objectInput.readUTF();
        this.hasId = true;
        this.id_ = readUTF;
        int readInt = objectInput.readInt();
        this.hasCountryCode = true;
        this.countryCode_ = readInt;
        String readUTF2 = objectInput.readUTF();
        this.hasInternationalPrefix = true;
        this.internationalPrefix_ = readUTF2;
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.hasPreferredInternationalPrefix = true;
            this.preferredInternationalPrefix_ = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.hasNationalPrefix = true;
            this.nationalPrefix_ = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.hasPreferredExtnPrefix = true;
            this.preferredExtnPrefix_ = readUTF5;
        }
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.hasNationalPrefixForParsing = true;
            this.nationalPrefixForParsing_ = readUTF6;
        }
        if (objectInput.readBoolean()) {
            String readUTF7 = objectInput.readUTF();
            this.hasNationalPrefixTransformRule = true;
            this.nationalPrefixTransformRule_ = readUTF7;
        }
        boolean readBoolean = objectInput.readBoolean();
        this.hasSameMobileAndFixedLinePattern = true;
        this.sameMobileAndFixedLinePattern_ = readBoolean;
        int readInt2 = objectInput.readInt();
        for (int i = 0; i < readInt2; i++) {
            C10140fM c10140fM = new C10140fM();
            c10140fM.readExternal(objectInput);
            this.numberFormat_.add(c10140fM);
        }
        int readInt3 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt3; i2++) {
            C10140fM c10140fM2 = new C10140fM();
            c10140fM2.readExternal(objectInput);
            this.intlNumberFormat_.add(c10140fM2);
        }
        boolean readBoolean2 = objectInput.readBoolean();
        this.hasMainCountryForCode = true;
        this.mainCountryForCode_ = readBoolean2;
        if (objectInput.readBoolean()) {
            String readUTF8 = objectInput.readUTF();
            this.hasLeadingDigits = true;
            this.leadingDigits_ = readUTF8;
        }
        boolean readBoolean3 = objectInput.readBoolean();
        this.hasLeadingZeroPossible = true;
        this.leadingZeroPossible_ = readBoolean3;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.hasGeneralDesc);
        if (this.hasGeneralDesc) {
            this.generalDesc_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasFixedLine);
        if (this.hasFixedLine) {
            this.fixedLine_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasMobile);
        if (this.hasMobile) {
            this.mobile_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasTollFree);
        if (this.hasTollFree) {
            this.tollFree_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPremiumRate);
        if (this.hasPremiumRate) {
            this.premiumRate_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasSharedCost);
        if (this.hasSharedCost) {
            this.sharedCost_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPersonalNumber);
        if (this.hasPersonalNumber) {
            this.personalNumber_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasVoip);
        if (this.hasVoip) {
            this.voip_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPager);
        if (this.hasPager) {
            this.pager_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasUan);
        if (this.hasUan) {
            this.uan_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasVoicemail);
        if (this.hasVoicemail) {
            this.voicemail_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasEmergency);
        if (this.hasEmergency) {
            this.emergency_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasNoInternationalDialling);
        if (this.hasNoInternationalDialling) {
            this.noInternationalDialling_.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.id_);
        objectOutput.writeInt(this.countryCode_);
        objectOutput.writeUTF(this.internationalPrefix_);
        objectOutput.writeBoolean(this.hasPreferredInternationalPrefix);
        if (this.hasPreferredInternationalPrefix) {
            objectOutput.writeUTF(this.preferredInternationalPrefix_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefix);
        if (this.hasNationalPrefix) {
            objectOutput.writeUTF(this.nationalPrefix_);
        }
        objectOutput.writeBoolean(this.hasPreferredExtnPrefix);
        if (this.hasPreferredExtnPrefix) {
            objectOutput.writeUTF(this.preferredExtnPrefix_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefixForParsing);
        if (this.hasNationalPrefixForParsing) {
            objectOutput.writeUTF(this.nationalPrefixForParsing_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefixTransformRule);
        if (this.hasNationalPrefixTransformRule) {
            objectOutput.writeUTF(this.nationalPrefixTransformRule_);
        }
        objectOutput.writeBoolean(this.sameMobileAndFixedLinePattern_);
        int size = this.numberFormat_.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((C10140fM) this.numberFormat_.get(i)).writeExternal(objectOutput);
        }
        int size2 = this.intlNumberFormat_.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((C10140fM) this.intlNumberFormat_.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.mainCountryForCode_);
        objectOutput.writeBoolean(this.hasLeadingDigits);
        if (this.hasLeadingDigits) {
            objectOutput.writeUTF(this.leadingDigits_);
        }
        objectOutput.writeBoolean(this.leadingZeroPossible_);
    }
}
