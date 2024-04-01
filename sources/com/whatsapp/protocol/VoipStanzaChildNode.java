package com.whatsapp.protocol;

import X.C02590Ca;
import X.C04P;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class VoipStanzaChildNode {
    public final C04P[] attributes;
    public final VoipStanzaChildNode[] children;
    public final byte[] data;
    public final String tag;

    public VoipStanzaChildNode(String str, C04P[] c04pArr, VoipStanzaChildNode[] voipStanzaChildNodeArr, byte[] bArr) {
        this.tag = str;
        this.attributes = c04pArr;
        this.children = voipStanzaChildNodeArr;
        this.data = bArr;
    }

    public static VoipStanzaChildNode fromProtocolTreeNode(C02590Ca c02590Ca) {
        VoipStanzaChildNode[] voipStanzaChildNodeArr;
        C02590Ca[] c02590CaArr = c02590Ca.A03;
        if (c02590CaArr != null) {
            int length = c02590CaArr.length;
            voipStanzaChildNodeArr = new VoipStanzaChildNode[length];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                voipStanzaChildNodeArr[i2] = fromProtocolTreeNode(c02590CaArr[i]);
                i++;
                i2++;
            }
        } else {
            voipStanzaChildNodeArr = null;
        }
        return new VoipStanzaChildNode(c02590Ca.A00, c02590Ca.A0I(), voipStanzaChildNodeArr, c02590Ca.A01);
    }

    public C04P[] getAttributesCopy() {
        C04P[] c04pArr = this.attributes;
        if (c04pArr != null) {
            return (C04P[]) Arrays.copyOf(c04pArr, c04pArr.length);
        }
        return null;
    }

    public Object[] getAttributesFlattedCopy() {
        C04P[] c04pArr = this.attributes;
        if (c04pArr != null) {
            Object[] objArr = new Object[c04pArr.length << 1];
            int i = 0;
            for (C04P c04p : c04pArr) {
                int i2 = i + 1;
                objArr[i] = c04p.A02;
                Jid jid = c04p.A01;
                if (jid != null) {
                    i = i2 + 1;
                    objArr[i2] = jid;
                } else {
                    i = i2 + 1;
                    objArr[i2] = c04p.A03;
                }
            }
            return objArr;
        }
        return null;
    }

    public VoipStanzaChildNode[] getChildrenCopy() {
        VoipStanzaChildNode[] voipStanzaChildNodeArr = this.children;
        if (voipStanzaChildNodeArr != null) {
            return (VoipStanzaChildNode[]) Arrays.copyOf(voipStanzaChildNodeArr, voipStanzaChildNodeArr.length);
        }
        return null;
    }

    public byte[] getDataCopy() {
        byte[] bArr = this.data;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public String getTag() {
        return this.tag;
    }

    public C02590Ca toProtocolTreeNode() {
        C02590Ca[] c02590CaArr;
        int length;
        byte[] bArr = this.data;
        if (bArr != null) {
            return new C02590Ca(this.tag, this.attributes, null, bArr);
        }
        VoipStanzaChildNode[] voipStanzaChildNodeArr = this.children;
        if (voipStanzaChildNodeArr == null || (length = voipStanzaChildNodeArr.length) <= 0) {
            c02590CaArr = null;
        } else {
            c02590CaArr = new C02590Ca[length];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                c02590CaArr[i2] = voipStanzaChildNodeArr[i].toProtocolTreeNode();
                i++;
                i2++;
            }
        }
        return new C02590Ca(this.tag, this.attributes, c02590CaArr, null);
    }

    /* loaded from: classes2.dex */
    public class Builder {
        public Map attributes;
        public List children;
        public byte[] data;
        public final String tag;

        public Builder(String str) {
            this.tag = str;
        }

        private Builder addAttribute(String str, C04P c04p) {
            Map map = this.attributes;
            if (map == null) {
                map = new HashMap();
                this.attributes = map;
            }
            if (map.put(str, c04p) == null) {
                return this;
            }
            throw new IllegalArgumentException("node may not have duplicate attributes");
        }

        public Builder addAttribute(String str, Jid jid) {
            addAttribute(str, new C04P(str, jid));
            return this;
        }

        public Builder addAttribute(String str, String str2) {
            addAttribute(str, new C04P(str, str2, null, (byte) 0));
            return this;
        }

        public Builder addAttributes(C04P[] c04pArr) {
            if (c04pArr != null) {
                for (C04P c04p : c04pArr) {
                    addAttribute(c04p.A02, c04p.A03);
                }
            }
            return this;
        }

        public Builder addChild(VoipStanzaChildNode voipStanzaChildNode) {
            if (this.data == null) {
                List list = this.children;
                if (list == null) {
                    list = new ArrayList();
                    this.children = list;
                }
                list.add(voipStanzaChildNode);
                return this;
            }
            throw new IllegalArgumentException("node may not have both data and children");
        }

        public Builder addChildren(VoipStanzaChildNode[] voipStanzaChildNodeArr) {
            if (voipStanzaChildNodeArr != null) {
                for (VoipStanzaChildNode voipStanzaChildNode : voipStanzaChildNodeArr) {
                    addChild(voipStanzaChildNode);
                }
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public VoipStanzaChildNode build() {
            C04P[] c04pArr;
            int size;
            Map map = this.attributes;
            if (map == null || (size = map.size()) <= 0) {
                c04pArr = 0;
            } else {
                c04pArr = new C04P[size];
                int i = 0;
                for (Map.Entry entry : this.attributes.entrySet()) {
                    c04pArr[i] = entry.getValue();
                    i++;
                }
            }
            List list = this.children;
            return new VoipStanzaChildNode(this.tag, c04pArr, list != null ? (VoipStanzaChildNode[]) list.toArray(new VoipStanzaChildNode[0]) : null, this.data);
        }

        public Builder setData(byte[] bArr) {
            if (this.children == null) {
                this.data = bArr;
                return this;
            }
            throw new IllegalArgumentException("node may not have both data and children");
        }
    }
}
