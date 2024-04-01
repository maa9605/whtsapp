package X;

import java.io.Serializable;

/* renamed from: X.0fH */
/* loaded from: classes.dex */
public class C10090fH implements Serializable {
    public static final long serialVersionUID = 1;
    public boolean hasCountryCode;
    public boolean hasCountryCodeSource;
    public boolean hasExtension;
    public boolean hasItalianLeadingZero;
    public boolean hasNationalNumber;
    public boolean hasPreferredDomesticCarrierCode;
    public boolean hasRawInput;
    public boolean hasSecondLeadingZero;
    public int countryCode_ = 0;
    public long nationalNumber_ = 0;
    public String extension_ = "";
    public boolean italianLeadingZero_ = false;
    public String rawInput_ = "";
    public String preferredDomesticCarrierCode_ = "";
    public boolean secondLeadingZero_ = false;
    public EnumC10100fI countryCodeSource_ = EnumC10100fI.FROM_NUMBER_WITH_PLUS_SIGN;

    public void A00(C10090fH c10090fH) {
        if (c10090fH.hasCountryCode) {
            int i = c10090fH.countryCode_;
            this.hasCountryCode = true;
            this.countryCode_ = i;
        }
        if (c10090fH.hasNationalNumber) {
            long j = c10090fH.nationalNumber_;
            this.hasNationalNumber = true;
            this.nationalNumber_ = j;
        }
        if (c10090fH.hasExtension) {
            String str = c10090fH.extension_;
            if (str != null) {
                this.hasExtension = true;
                this.extension_ = str;
            } else {
                throw null;
            }
        }
        if (c10090fH.hasItalianLeadingZero) {
            boolean z = c10090fH.italianLeadingZero_;
            this.hasItalianLeadingZero = true;
            this.italianLeadingZero_ = z;
        }
        if (c10090fH.hasRawInput) {
            String str2 = c10090fH.rawInput_;
            if (str2 != null) {
                this.hasRawInput = true;
                this.rawInput_ = str2;
            } else {
                throw null;
            }
        }
        if (c10090fH.hasCountryCodeSource) {
            EnumC10100fI enumC10100fI = c10090fH.countryCodeSource_;
            if (enumC10100fI != null) {
                this.hasCountryCodeSource = true;
                this.countryCodeSource_ = enumC10100fI;
            } else {
                throw null;
            }
        }
        if (c10090fH.hasPreferredDomesticCarrierCode) {
            String str3 = c10090fH.preferredDomesticCarrierCode_;
            if (str3 != null) {
                this.hasPreferredDomesticCarrierCode = true;
                this.preferredDomesticCarrierCode_ = str3;
            } else {
                throw null;
            }
        }
        if (c10090fH.hasSecondLeadingZero) {
            boolean z2 = c10090fH.secondLeadingZero_;
            this.hasSecondLeadingZero = true;
            this.secondLeadingZero_ = z2;
        }
    }

    public boolean A01(C10090fH c10090fH) {
        if (c10090fH == null) {
            return false;
        }
        if (this == c10090fH) {
            return true;
        }
        return this.countryCode_ == c10090fH.countryCode_ && this.nationalNumber_ == c10090fH.nationalNumber_ && this.extension_.equals(c10090fH.extension_) && this.italianLeadingZero_ == c10090fH.italianLeadingZero_ && this.rawInput_.equals(c10090fH.rawInput_) && this.countryCodeSource_ == c10090fH.countryCodeSource_ && this.preferredDomesticCarrierCode_.equals(c10090fH.preferredDomesticCarrierCode_) && this.hasPreferredDomesticCarrierCode == c10090fH.hasPreferredDomesticCarrierCode && this.secondLeadingZero_ == c10090fH.secondLeadingZero_;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10090fH) && A01((C10090fH) obj);
    }

    public int hashCode() {
        return ((((this.preferredDomesticCarrierCode_.hashCode() + ((this.countryCodeSource_.hashCode() + ((this.rawInput_.hashCode() + ((((this.extension_.hashCode() + ((Long.valueOf(this.nationalNumber_).hashCode() + ((this.countryCode_ + 2173) * 53)) * 53)) * 53) + (this.italianLeadingZero_ ? 1231 : 1237)) * 53)) * 53)) * 53)) * 53) + (this.hasPreferredDomesticCarrierCode ? 1231 : 1237)) * 53) + (this.secondLeadingZero_ ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("Country Code: ");
        A0P.append(this.countryCode_);
        A0P.append(" National Number: ");
        A0P.append(this.nationalNumber_);
        if (this.hasItalianLeadingZero && this.italianLeadingZero_) {
            A0P.append(" Leading Zero: true");
        }
        if (this.hasExtension) {
            A0P.append(" Extension: ");
            A0P.append(this.extension_);
        }
        if (this.hasCountryCodeSource) {
            A0P.append(" Country Code Source: ");
            A0P.append(this.countryCodeSource_);
        }
        if (this.hasPreferredDomesticCarrierCode) {
            A0P.append(" Preferred Domestic Carrier Code: ");
            A0P.append(this.preferredDomesticCarrierCode_);
        }
        if (this.hasSecondLeadingZero && this.secondLeadingZero_) {
            A0P.append(" Second Leading Zero: true");
        }
        return A0P.toString();
    }
}
