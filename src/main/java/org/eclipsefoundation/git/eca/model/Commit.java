/*******************************************************************************
 * Copyright (C) 2020 Eclipse Foundation
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package org.eclipsefoundation.git.eca.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Git commit with basic data and metadata about the revision.
 * 
 * @author Martin Lowe
 *
 */
public class Commit {
	private String hash;
	private String subject;
	private String body;
	private List<String> parents;
	private GitUser author;
	private GitUser committer;
	private boolean head;

	/**
	 * @return the hash
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * @param hash the hash to set
	 */
	public void setHash(String hash) {
		this.hash = hash;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

	/**
	 * @return the parents
	 */
	public List<String> getParents() {
		return new ArrayList<>(parents);
	}

	/**
	 * @param parents the parents to set
	 */
	public void setParents(List<String> parents) {
		this.parents = new ArrayList<>(parents);
	}

	/**
	 * @return the author
	 */
	public GitUser getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(GitUser author) {
		this.author = author;
	}

	/**
	 * @return the commiter
	 */
	public GitUser getCommitter() {
		return committer;
	}

	/**
	 * @param committer the committer to set
	 */
	public void setCommitter(GitUser committer) {
		this.committer = committer;
	}

	/**
	 * @return the head
	 */
	public boolean isHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(boolean head) {
		this.head = head;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Commit [hash=");
		builder.append(hash);
		builder.append(", subject=");
		builder.append(subject);
		builder.append(", body=");
		builder.append(body);
		builder.append(", parents=");
		builder.append(parents);
		builder.append(", author=");
		builder.append(author);
		builder.append(", committer=");
		builder.append(committer);
		builder.append(", head=");
		builder.append(head);
		builder.append("]");
		return builder.toString();
	}
	
}
