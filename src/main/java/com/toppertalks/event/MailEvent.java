package com.toppertalks.event;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id", scope = MailEvent.class)
public class MailEvent implements Event{
	private String messageType;
	private String from;
	private String name;
	private String toRecipient;
	private String ccRecipient;
	private String bccRecipient;
	private File attachement;
	private String body;
	
	@Override
	public String toString() {
		return "MailEvent [messageType=" + messageType + ", from=" + from + ", name=" + name + ", toRecipient="
				+ toRecipient + ", ccRecipient=" + ccRecipient + ", bccRecipient=" + bccRecipient + ", attachement="
				+ attachement + ", body=" + body + "]";
	}
	
	
}



