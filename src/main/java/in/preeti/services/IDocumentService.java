package in.preeti.services;

import java.util.List;

import in.preeti.entity.Document;

public interface IDocumentService {
	void saveDocument(Document doc);
	List<Object[]> getDocumentIdAndName();
	void deleteDocumentById(Long id);
	Document getDocumentById(Long id);
}
