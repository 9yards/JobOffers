package at.nineyards.hr

import at.nineyards.hr.JobOfferActivity
import java.util.stream.Collector

class SeniorAndroidDeveloper : JobOfferActivity() {

    var companyName = "9Y Media Group GmbH"

    var location1 = "Vienna/Austria"
    var location2 = "Zagreb/Croatia"

    var important = true

    fun getRecruit() {

        // Working alongside our Head of Engineering, you will lead a team of Mobile Engineers.
        // You will grow as a developer and tech leader within the company through your work and
        // collaboration with our Head of Engineering, PM and CEO on mostly Kotlin based native
        // Android projects.
        // You'll have a lot of autonomy and influence on the technical direction of the company.
    }

    override fun onStart() {
        super.onStart()

        if( yourResponsibility() == "sounds good for you" &&
                yourCharacter() == "our values" &&
                perks() == "are also nice") {
            // TODO: create PR or write us an email to hello@9yards.at
        }
    }

    fun yourResponsibility() : String  {
        arrayOf(
            "- Help shape our development culture and best practices.",
            "- Develop and maintain native Kotlin/Java Android applications.",
            "- Develope Kotlin based backend services/APIs (optional).",
            "- Work either as a lead dev with a team or as a solo dev depending on the project.",
            "- Own the development process and push back when needed against PM/Leads to ensure that projects are delivered to a high level of quality without the need for heroics.",
            "- Mentor other developers.",
            "- Develop reusable libraries that may be open sourced (for which you will be credited as the author).",
            "- Participate in all project phases, from requirements analysis through implementation to customer support regarding technical issues.",
            "- Ensure you and your colleagues ship clean code and follow good development practices.",
            "- Help identify and scope out future projects, then manage those projects from the technical side, contributing to the codebase as needed in an IC capacity or as a tech lead depending on project needs."
        ).joinToString(separator = ",\n")
    }

    // fun yourPreferredCharacteristicsValuesAndTraits(){
    fun yourCharacter() : String {
        arrayOf(
            "- Independent thinker, who does not need hand holding and likes it when people get out of his/her way so that he/she can get things done.",
            "- Courage to push back against superiors when they make mistakes (hint: they do, more often than they'd like).",
            "- Ability to have productive arguments with colleagues. Ability to balance fighting hard for your own points on their merit, while being able to recognise and concede when someone else's idea may be more suited for the particular situation at hand.",
            "- A love for being challenged, and an understanding that this is one of the best ways to grow.",
            "- Appreciation that sometimes a technically inferior solution is the overall better decision (e.g. due to economics or time-to-market). This should be hard for you to accept, but you should be able to do this on occasion.",
            "- Appreciation for working in a team that prefers async communication as opposed to interrupt-driven meeting-based communication."
        ).joinToString(separator = ",\n")
    }

    fun minimalLevelOfEducation(){
        var level = !important // our Head of Engineering dropped out of university to co-found 9yards
    }

    fun perks() : String{
        arrayOf(
            "- Free choice of hardware",
            "- Company subsidized lunch",
            "- 9yards is very remote friendly and team members may work from home",
            "- Flexible working hours (we recognize that 9-5 may not be your most productive time, some of us also have kids and families)",
            "- Salary depending on your skill level"
        ).joinToString(separator = ",\n")

    }

}