package X;

import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializableLocation;
import com.whatsapp.SerializablePoint;
import java.util.Set;

/* renamed from: X.2uQ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60402uQ {
    public final C60382uO A00;

    public C60402uQ(C60382uO c60382uO) {
        this.A00 = c60382uO;
    }

    public void A00(String str, C09H c09h, C09H c09h2, Set set) {
        if (c09h == c09h2) {
            return;
        }
        C60382uO c60382uO = this.A00;
        c60382uO.A0J(C000200d.A0H(str, " expected value is null."), c09h != null);
        c60382uO.A0J(C000200d.A0H(str, " actual value is null."), c09h2 != null);
        if (!set.contains("MediaDataV2.transfering")) {
            c60382uO.A0F(C000200d.A0H(str, " Field: transfering."), Boolean.valueOf(c09h.A0a), Boolean.valueOf(c09h2.A0a));
        }
        if (!set.contains("MediaDataV2.prefetching")) {
            c60382uO.A0F(C000200d.A0H(str, " Field: prefetching."), Boolean.valueOf(c09h.A0Y), Boolean.valueOf(c09h2.A0Y));
        }
        if (!set.contains("MediaDataV2.dedupeDownload")) {
            c60382uO.A0F(C000200d.A0H(str, " Field: dedupeDownload."), Boolean.valueOf(c09h.A0W), Boolean.valueOf(c09h2.A0W));
        }
        if (!set.contains("MediaDataV2.streamViewable")) {
            c60382uO.A0F(C000200d.A0H(str, " Field: streamViewable."), Boolean.valueOf(c09h.A0Z), Boolean.valueOf(c09h2.A0Z));
        }
        if (!set.contains("MediaDataV2.transferred")) {
            StringBuilder A0V = C000200d.A0V(str, " Field: transferred.{before:");
            boolean z = c09h.A0P;
            A0V.append(z);
            A0V.append(", after:");
            boolean z2 = c09h2.A0P;
            A0V.append(z2);
            A0V.append("}");
            c60382uO.A0F(A0V.toString(), Boolean.valueOf(z), Boolean.valueOf(z2));
        }
        if (!set.contains("MediaDataV2.progress")) {
            c60382uO.A0F(C000200d.A0H(str, " Field: progress."), Long.valueOf(c09h.A0C), Long.valueOf(c09h2.A0C));
        }
        if (!set.contains("MediaDataV2.file")) {
            c60382uO.A0F(C000200d.A0H(str, " Field: file."), c09h.A0F, c09h2.A0F);
        }
        if (!set.contains("MediaDataV2.fileSize")) {
            c60382uO.A0F(C000200d.A0H(str, " Field: fileSize."), Long.valueOf(c09h.A0A), Long.valueOf(c09h2.A0A));
        }
        if (!set.contains("MediaDataV2.autodownloadRetryEnabled")) {
            c60382uO.A0F(C000200d.A0H(str, " Field: autodownloadRetryEnabled."), Boolean.valueOf(c09h.A0L), Boolean.valueOf(c09h2.A0L));
        }
        if (!set.contains("MediaDataV2.transcoded")) {
            c60382uO.A0F(C000200d.A0H(str, " Field: transcoded."), Boolean.valueOf(c09h.A0O), Boolean.valueOf(c09h2.A0O));
        }
        if (!set.contains("MediaDataV2.suspiciousContent")) {
            c60382uO.A0F(C000200d.A0H(str, " Field: suspiciousContent."), Integer.valueOf(c09h.A07), Integer.valueOf(c09h2.A07));
        }
        if (!set.contains("MediaDataV2.trimFrom")) {
            c60382uO.A0F(C000200d.A0H(str, " Field: trimFrom."), Long.valueOf(c09h.A0D), Long.valueOf(c09h2.A0D));
        }
        if (!set.contains("MediaDataV2.trimTo")) {
            c60382uO.A0F(C000200d.A0H(str, " Field: trimTo."), Long.valueOf(c09h.A0E), Long.valueOf(c09h2.A0E));
        }
        if (!set.contains("MediaDataV2.faceX")) {
            c60382uO.A0F(C000200d.A0H(str, " Field: faceX."), Integer.valueOf(c09h.A02), Integer.valueOf(c09h2.A02));
        }
        if (!set.contains("MediaDataV2.faceY")) {
            c60382uO.A0F(C000200d.A0H(str, " Field: faceY."), Integer.valueOf(c09h.A03), Integer.valueOf(c09h2.A03));
        }
        if (!set.contains("MediaDataV2.mediaKey")) {
            c60382uO.A0K(C000200d.A0H(str, " Field: mediaKey."), c09h.A0U, c09h2.A0U);
        }
        if (!set.contains("MediaDataV2.refKey")) {
            c60382uO.A0K(C000200d.A0H(str, " Field: refKey."), null, null);
        }
        if (!set.contains("MediaDataV2.cipherKey")) {
            c60382uO.A0K(C000200d.A0H(str, " Field: cipherKey."), c09h.A0Q, c09h2.A0Q);
        }
        if (!set.contains("MediaDataV2.hmacKey")) {
            c60382uO.A0K(C000200d.A0H(str, " Field: hmacKey."), c09h.A0S, c09h2.A0S);
        }
        if (!set.contains("MediaDataV2.iv")) {
            c60382uO.A0K(C000200d.A0H(str, " Field: iv."), c09h.A0T, c09h2.A0T);
        }
        if (!set.contains("MediaDataV2.width")) {
            c60382uO.A0F(C000200d.A0H(str, " Field: width."), Integer.valueOf(c09h.A08), Integer.valueOf(c09h2.A08));
        }
        if (!set.contains("MediaDataV2.height")) {
            c60382uO.A0F(C000200d.A0H(str, " Field: height."), Integer.valueOf(c09h.A06), Integer.valueOf(c09h2.A06));
        }
        if (!set.contains("MediaDataV2.doodleId")) {
            c60382uO.A0H(C000200d.A0H(str, " Field: doodleId."), c09h.A0H, c09h2.A0H);
        }
        if (!set.contains("MediaDataV2.hasStreamingSidecar")) {
            c60382uO.A0F(C000200d.A0H(str, " Field: hasStreamingSidecar."), Boolean.valueOf(c09h.A0M), Boolean.valueOf(c09h2.A0M));
        }
        if (!set.contains("MediaDataV2.cachedDownloadedBytes")) {
            c60382uO.A0F(C000200d.A0H(str, " Field: cachedDownloadedBytes."), Long.valueOf(c09h.A09), Long.valueOf(c09h2.A09));
        }
        if (!set.contains("MediaDataV2.gifAttribution")) {
            c60382uO.A0F(C000200d.A0H(str, " Field: gifAttribution."), Integer.valueOf(c09h.A05), Integer.valueOf(c09h2.A05));
        }
        if (!set.contains("MediaDataV2.thumbnailHeightWidthRatio")) {
            String A0H = C000200d.A0H(str, " Field: thumbnailHeightWidthRatio.");
            float f = c09h.A00;
            float f2 = c09h2.A00;
            if (Float.compare(f, f2) != 0 && Math.abs(f - f2) > 1.0E-9f) {
                c60382uO.A0C(A0H);
                throw null;
            }
        }
        if (!set.contains("MediaDataV2.mediaJobUuid")) {
            c60382uO.A0H(C000200d.A0H(str, " Field: mediaJobUuid."), c09h.A0I, c09h2.A0I);
        }
        if (!set.contains("MediaDataV2.directPath")) {
            c60382uO.A0H(C000200d.A0H(str, " Field: directPath."), c09h.A0G, c09h2.A0G);
        }
        if (set.contains("MediaDataV2.interactiveAnnotations")) {
            return;
        }
        String A0H2 = C000200d.A0H(str, " Field: interactiveAnnotations.");
        InteractiveAnnotation[] interactiveAnnotationArr = c09h.A0V;
        InteractiveAnnotation[] interactiveAnnotationArr2 = c09h2.A0V;
        if (interactiveAnnotationArr != interactiveAnnotationArr2) {
            c60382uO.A0J(C000200d.A0H(A0H2, " expected value is null."), interactiveAnnotationArr != null);
            c60382uO.A0J(C000200d.A0H(A0H2, " actual value is null."), interactiveAnnotationArr2 != null);
            String A0H3 = C000200d.A0H(A0H2, " Field: length.");
            int length = interactiveAnnotationArr.length;
            c60382uO.A0F(A0H3, Integer.valueOf(length), Integer.valueOf(interactiveAnnotationArr2.length));
            for (int i = 0; i < length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(A0H2);
                sb.append(" Field: value[");
                sb.append(i);
                sb.append("].");
                String obj = sb.toString();
                InteractiveAnnotation interactiveAnnotation = interactiveAnnotationArr[i];
                InteractiveAnnotation interactiveAnnotation2 = interactiveAnnotationArr2[i];
                if (interactiveAnnotation != interactiveAnnotation2) {
                    c60382uO.A0J(C000200d.A0H(obj, " expected value is null."), interactiveAnnotation != null);
                    c60382uO.A0J(C000200d.A0H(obj, " actual value is null."), interactiveAnnotation2 != null);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(obj);
                    sb2.append(" Field: serializableLocation.");
                    String obj2 = sb2.toString();
                    SerializableLocation serializableLocation = interactiveAnnotation.serializableLocation;
                    SerializableLocation serializableLocation2 = interactiveAnnotation2.serializableLocation;
                    if (serializableLocation != serializableLocation2) {
                        c60382uO.A0J(C000200d.A0H(obj2, " expected value is null."), serializableLocation != null);
                        c60382uO.A0J(C000200d.A0H(obj2, " actual value is null."), serializableLocation2 != null);
                        c60382uO.A0D(C000200d.A0H(obj2, " Field: latitude."), serializableLocation.latitude, serializableLocation2.latitude);
                        c60382uO.A0D(C000200d.A0H(obj2, " Field: longitude."), serializableLocation.longitude, serializableLocation2.longitude);
                        c60382uO.A0H(C000200d.A0H(obj2, " Field: name."), serializableLocation.name, serializableLocation2.name);
                    }
                    String A0H4 = C000200d.A0H(obj, " Field: polygonVertices.");
                    SerializablePoint[] serializablePointArr = interactiveAnnotation.polygonVertices;
                    SerializablePoint[] serializablePointArr2 = interactiveAnnotation2.polygonVertices;
                    if (serializablePointArr != serializablePointArr2) {
                        c60382uO.A0J(C000200d.A0H(A0H4, " expected value is null."), serializablePointArr != null);
                        c60382uO.A0J(C000200d.A0H(A0H4, " actual value is null."), serializablePointArr2 != null);
                        String A0H5 = C000200d.A0H(A0H4, " Field: length.");
                        int length2 = serializablePointArr.length;
                        c60382uO.A0F(A0H5, Integer.valueOf(length2), Integer.valueOf(serializablePointArr2.length));
                        for (int i2 = 0; i2 < length2; i2++) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(A0H4);
                            sb3.append(" Field: value[");
                            sb3.append(i2);
                            sb3.append("].");
                            String obj3 = sb3.toString();
                            SerializablePoint serializablePoint = serializablePointArr[i2];
                            SerializablePoint serializablePoint2 = serializablePointArr2[i2];
                            if (serializablePoint != serializablePoint2) {
                                c60382uO.A0J(C000200d.A0H(obj3, " expected value is null."), serializablePoint != null);
                                c60382uO.A0J(C000200d.A0H(obj3, " actual value is null."), serializablePoint2 != null);
                                c60382uO.A0D(C000200d.A0H(obj3, " Field: x."), serializablePoint.x, serializablePoint2.x);
                                c60382uO.A0D(C000200d.A0H(obj3, " Field: y."), serializablePoint.y, serializablePoint2.y);
                            }
                        }
                    }
                }
            }
        }
    }
}
