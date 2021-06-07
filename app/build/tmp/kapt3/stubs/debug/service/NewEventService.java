package service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\fJ\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0006R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@BX\u0086\u000e\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lservice/NewEventService;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "eventDescription", "", "getEventDescription", "()Ljava/lang/String;", "setEventDescription", "(Ljava/lang/String;)V", "<set-?>", "", "eventImage", "getEventImage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "eventName", "getEventName", "setEventName", "sharedPreferences", "Landroid/content/SharedPreferences;", "loadData", "", "saveEvenDescr", "newDescr", "saveEvenImage", "newImage", "saveEvenName", "newName", "app_debug"})
public final class NewEventService {
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String eventName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String eventDescription;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer eventImage;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEventName() {
        return null;
    }
    
    public final void setEventName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEventDescription() {
        return null;
    }
    
    public final void setEventDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEventImage() {
        return null;
    }
    
    public final void saveEvenName(@org.jetbrains.annotations.NotNull()
    java.lang.String newName) {
    }
    
    public final void saveEvenDescr(@org.jetbrains.annotations.NotNull()
    java.lang.String newDescr) {
    }
    
    public final void saveEvenImage(int newImage) {
    }
    
    private final void loadData() {
    }
    
    public NewEventService(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}