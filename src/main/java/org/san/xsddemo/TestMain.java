package org.san.xsddemo;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class TestMain {
    public static void main(String[] args) {
        final PersonDetails personDetails = new PersonDetails();
        final FormData formData = new FormData();
        final ContactInformation contactInformation = new ContactInformation();
        final EmailAddress value = new EmailAddress();
        value.setEmailAddress("email");
        value.setCellPhone("123");
        value.setLanguage("EN");

        contactInformation.setEmailAddress(value);
        formData.getContactInformation().add(contactInformation);
        personDetails.setFormData(formData);
        final String xml = jaxbObjectToXML(personDetails);
        System.out.println(xml);
        final PersonDetails personDetails2 = xmlTojaxbObject(xml);
        final EmailAddress emailAddress = personDetails2.getFormData().getContactInformation().get(0).getEmailAddress();
        System.out.println(emailAddress.getEmailAddress() + " : " + emailAddress.getCellPhone() + " : " + emailAddress.getLanguage());
    }

    private static PersonDetails xmlTojaxbObject(String xml) {
        PersonDetails personDetails = null;
        try {
            final JAXBContext jaxbContext = JAXBContext.newInstance(PersonDetails.class);
            final Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            personDetails = (PersonDetails) unmarshaller.unmarshal(new StringReader(xml));

        } catch (final JAXBException e) {
            e.printStackTrace();
        }

        return personDetails;
    }

    private static String jaxbObjectToXML(PersonDetails personDetails) {
        String xmlContent = null;

        try {
            final JAXBContext jaxbContext = JAXBContext.newInstance(PersonDetails.class);

            final Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            final StringWriter sw = new StringWriter();

            jaxbMarshaller.marshal(personDetails, sw);

            xmlContent = sw.toString();

        } catch (final JAXBException e) {
            e.printStackTrace();
        }
        return xmlContent;
    }
}
